package bigCloudAI.github.io.cloud.docker.swarm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class SwarmJoin {
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/swarm/join";//host.getHostIp();
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
		System.out.println(template);
		JSONObject jsonObject = template.postForObject(apiUrl, formEntity, JSONObject.class);
		return jsonObject;
	}
	
	public SwarmJoin join(String joinToken,String advertiseAddr){ //192.168.1.1:2377
		apiParams = new JSONObject();
		apiParams.accumulate("ListenAddr", "0.0.0.0:2377");
		apiParams.accumulate("AdvertiseAddr", advertiseAddr);
		apiParams.accumulate("RemoteAddrs",new JSONArray());
		apiParams.getJSONArray("RemoteAddrs").add(advertiseAddr);
		apiParams.accumulate("JoinToken", joinToken);
		return this;
	}

	public RestTemplate getTemplate() {
		return template;
	}

	public void setTemplate(RestTemplate template) {
		this.template = template;
	}

	public JSONObject getApiParams() {
		return apiParams;
	}

	public void setApiParams(JSONObject apiParams) {
		this.apiParams = apiParams;
	}
}
