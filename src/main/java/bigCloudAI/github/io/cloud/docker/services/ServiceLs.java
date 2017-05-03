package bigCloudAI.github.io.cloud.docker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Service
public class ServiceLs {

	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/services";//host.getHostIp();
	}

	@Autowired
	private RestTemplate template;

	JSONObject apiParams;

	public JSONArray send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		JSONArray jsonArray = template.getForObject(apiUrl,JSONArray.class);
		return jsonArray;
	}
	
	public ServiceLs ls(){
		return this;
	}
}
