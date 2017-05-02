package bigCloudAI.github.io.cloud.docker.nodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONObject;

@Service
public class NodeRm {
	String nodeIdOrName;
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/nodes/"+this.getNodeIdOrName();//host.getHostIp();
	}
	
	@Autowired
	private RestTemplate template;

	JSONObject apiParams;

	public NodeRm send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		template.delete(apiUrl);
		return this;
	}
	
	public NodeRm rm(String nodeIdOrName){ //m0kn1h90e34a  1493694632651 
		this.setNodeIdOrName(nodeIdOrName);
		return this;
	}

	public String getNodeIdOrName() {
		return nodeIdOrName;
	}

	public void setNodeIdOrName(String nodeIdOrName) {
		this.nodeIdOrName = nodeIdOrName;
	}
	
}
