package bigCloudAI.github.io.cloud.docker.swarm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONObject;
@Service
public class SwarmLeave {
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/swarm/leave?force="+(this.isForce()?1:0) ;//host.getHostIp();
	}

	boolean force;
	@Autowired
	private RestTemplate template;

	JSONObject apiParams;

	public JSONObject send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		HttpEntity<String> formEntity = new HttpEntity<String>(this.getApiParams().toString(), headers);
		JSONObject jsonObject = template.postForObject(apiUrl, formEntity, JSONObject.class);
		return jsonObject;
	}
	public SwarmLeave leave(){ //192.168.1.1:2377
		apiParams=new JSONObject();
		return this.leave(false);
	}
	
	public SwarmLeave leave(boolean force){ //192.168.1.1:2377
		this.setForce(force);
		return this;
	}

	public RestTemplate getTemplate() {
		return template;
	}

	public void setTemplate(RestTemplate template) {
		this.template = template;
	}

	public boolean isForce() {
		return force;
	}

	public void setForce(boolean force) {
		this.force = force;
	}

	public JSONObject getApiParams() {
		return apiParams;
	}

	public void setApiParams(JSONObject apiParams) {
		this.apiParams = apiParams;
	}
}
