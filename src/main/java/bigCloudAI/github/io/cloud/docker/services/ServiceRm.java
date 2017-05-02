package bigCloudAI.github.io.cloud.docker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceRm {

	
	String serviceIdOrName;
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/services/"+this.getServiceIdOrName();//host.getHostIp();
	}
	
	@Autowired
	private RestTemplate template;


	public ServiceRm send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		template.delete(apiUrl);
		return this;
	}
	
	public ServiceRm rm(String serviceIdOrName){ //m0kn1h90e34a  1493694632651 
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
