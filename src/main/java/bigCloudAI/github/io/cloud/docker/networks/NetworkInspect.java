package bigCloudAI.github.io.cloud.docker.networks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONObject;

@Service
public class NetworkInspect {

	String networkIdorName;
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/networks/"+this.getNetworkIdorName();//host.getHostIp();
	}

	@Autowired
	private RestTemplate template;


	public JSONObject send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		JSONObject jsonObject = template.getForObject(apiUrl,JSONObject.class);
		return jsonObject;
	}
	
	public NetworkInspect inspect(String networkIdorName){ //m0kn1h90e34a  1493694632651 
		this.setNetworkIdorName(networkIdorName);
		return this;
	}

	public String getNetworkIdorName() {
		return networkIdorName;
	}

	public void setNetworkIdorName(String networkIdorName) {
		this.networkIdorName = networkIdorName;
	}

	

	

}
