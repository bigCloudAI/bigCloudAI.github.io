package bigCloudAI.github.io.cloud.docker.networks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONArray;

@Service
public class NetworkLs {
	
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/networks";//host.getHostIp();
	}

	@Autowired
	private RestTemplate template;


	public JSONArray send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		JSONArray jsonArray = template.getForObject(apiUrl,JSONArray.class);
		return jsonArray;
	}
	
	public NetworkLs ls(){
		return this;
	}
}
