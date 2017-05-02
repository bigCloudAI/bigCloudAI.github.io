package bigCloudAI.github.io.cloud.docker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONObject;

@Service
public class ServiceInspect {

	String serviceIdOrName;
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/services/"+this.getServiceIdOrName();//host.getHostIp();
	}

	@Autowired
	private RestTemplate template;


	public JSONObject send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		JSONObject jsonObject = template.getForObject(apiUrl,JSONObject.class);
		return jsonObject;
	}
	
	public ServiceInspect inspect(String serviceIdOrName){ //m0kn1h90e34a  1493694632651 
		this.setServiceIdOrName(serviceIdOrName);
		return this;
	}

	public String getServiceIdOrName() {
		return serviceIdOrName;
	}

	public void setServiceIdOrName(String serviceIdOrName) {
		this.serviceIdOrName = serviceIdOrName;
	}

}
