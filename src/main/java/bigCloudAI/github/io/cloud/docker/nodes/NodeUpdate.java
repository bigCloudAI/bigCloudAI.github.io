package bigCloudAI.github.io.cloud.docker.nodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONObject;

@Service
public class NodeUpdate {

	String nodeId;
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/nodes/"+this.getNodeId()+"/update";//host.getHostIp();
	}

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
	
	public NodeUpdate update(String nodeId){
		this.setNodeId(nodeId);
		apiParams = new JSONObject();
		apiParams.accumulate("Availability", "active");// string	"active" "pause" "drain"		Availability of the node.
		apiParams.accumulate("Name", "node-name");
		apiParams.accumulate("Role","manager");
		apiParams.accumulate("Labels",new JSONObject());
		return this;
	}
	
	public NodeUpdate name(String nodeName){ //Name for the node.
		apiParams.element("Name", nodeName);
			return this;
		}
	
	public NodeUpdate role(String role){ //	“worker" "manager"		Role of the node.
		apiParams.element("Role", role);
			return this;
		}
	
	public NodeUpdate lable(String key,String value){ //User-defined key/value metadata.
		apiParams.getJSONObject("Labels").accumulate(key, value);
			return this;
	}
	

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public JSONObject getApiParams() {
		return apiParams;
	}

	public void setApiParams(JSONObject apiParams) {
		this.apiParams = apiParams;
	}
	
}
