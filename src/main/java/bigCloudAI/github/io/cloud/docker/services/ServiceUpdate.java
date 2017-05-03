package bigCloudAI.github.io.cloud.docker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONObject;

@Service
public class ServiceUpdate {

	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/services/"+this.getServiceIdOrName()+"/update?version="+this.getVersion();//host.getHostIp();
	}
	
	
	public static void main(String[] args) {
		ServiceUpdate serviceUpdate =new ServiceUpdate();
		serviceUpdate.setTemplate(new RestTemplate());
		JSONObject s = serviceUpdate.update("ry7xnplztd98","192.168.80.103:2375").scale(2).send("192.168.80.103:2375");
		System.out.println(s);
	}
	
	
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	ServiceInspect serviceInspect;

	JSONObject apiParams;
	String serviceIdOrName;
	String version;

	public JSONObject send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		HttpEntity<String> formEntity = new HttpEntity<String>(this.getApiParams().toString(), headers);
		System.out.println(this.getApiParams().toString());
		JSONObject jsonObject = template.postForObject(apiUrl, formEntity, JSONObject.class);
		return jsonObject;
	}
	
	public ServiceUpdate update(String serviceIdOrName,String ipPort){ //m0kn1h90e34a  1493694632651 
		this.setServiceIdOrName(serviceIdOrName);
		JSONObject jsonParams = serviceInspect.inspect(this.getServiceIdOrName()).send(ipPort);
		this.setApiParams(jsonParams.getJSONObject("Spec"));
		this.setVersion(jsonParams.getJSONObject("Version").getString("Index"));
		return this;
	}

	
	public ServiceUpdate scale(int replicas){
		apiParams.element("Mode", new JSONObject());
		apiParams.getJSONObject("Mode").accumulate("Replicated", new JSONObject().accumulate("Replicas", replicas));
		return this;
	}
	public String getServiceIdOrName() {
		return serviceIdOrName;
	}

	public void setServiceIdOrName(String serviceIdOrName) {
		this.serviceIdOrName = serviceIdOrName;
	}

	public JSONObject getApiParams() {
		return apiParams;
	}

	public void setApiParams(JSONObject apiParams) {
		this.apiParams = apiParams;
	}

	public RestTemplate getTemplate() {
		return template;
	}

	public void setTemplate(RestTemplate template) {
		this.template = template;
	}


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
