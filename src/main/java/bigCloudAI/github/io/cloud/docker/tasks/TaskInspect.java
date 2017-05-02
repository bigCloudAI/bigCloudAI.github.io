package bigCloudAI.github.io.cloud.docker.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONObject;

@Service
public class TaskInspect {
	String taskId;
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/tasks/"+this.getTaskId();//host.getHostIp();
	}

	@Autowired
	private RestTemplate template;


	public JSONObject send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		JSONObject jsonObject = template.getForObject(apiUrl,JSONObject.class);
		return jsonObject;
	}
	
	public TaskInspect inspect(String taskId){ //m0kn1h90e34a  1493694632651 
		this.setTaskId(taskId);
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
}
