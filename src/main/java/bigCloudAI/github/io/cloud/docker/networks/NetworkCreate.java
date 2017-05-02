package  bigCloudAI.github.io.cloud.docker.networks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class NetworkCreate {

	
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/networks/create";//host.getHostIp();
	}

	@Autowired
	private RestTemplate template;

	JSONObject apiParams;
	
	public static void main(String[] args) {
		NetworkCreate networkCreate =new NetworkCreate();
		networkCreate.setTemplate(new RestTemplate());
		JSONObject s = networkCreate.create().name("oknet").send("192.168.80.103:2375");
		System.out.println(s);
	}

	public JSONObject send(String ipPort) {//"192.168.80.200:2375"
		String apiUrl = this.getPortUrl(ipPort);
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		HttpEntity<String> formEntity = new HttpEntity<String>(this.getApiParams().toString(), headers);
		JSONObject jsonObject = template.postForObject(apiUrl, formEntity, JSONObject.class);
		return jsonObject;
	}

	public NetworkCreate create() {
		apiParams = new JSONObject();
		apiParams.accumulate("Name", "");
		apiParams.accumulate("CheckDuplicate", false);
		apiParams.accumulate("Driver", "bridge");
		apiParams.accumulate("EnableIPv6", false);
		apiParams.accumulate("Internal", true);
		apiParams.accumulate("Attachable", false);
		
		apiParams.accumulate("IPAM", new JSONObject());
		apiParams.getJSONObject("IPAM").accumulate("Driver", "default");
		apiParams.getJSONObject("IPAM").accumulate("Config", new JSONArray());
		/*apiParams.getJSONObject("IPAM").getJSONArray("Config").add(new JSONObject().accumulate("Subnet", "172.20.0.0/16")
				.accumulate("IPRange", "172.20.10.0/24").accumulate("Gateway", "172.20.10.11"));*/
		
		apiParams.getJSONObject("IPAM").accumulate("Options", new JSONObject());
		//apiParams.getJSONObject("IPAM").getJSONObject("Options").accumulate("foo", "bar");
		
		apiParams.accumulate("Options", new JSONObject());
		/*apiParams.getJSONObject("Options").accumulate("com.docker.network.bridge.default_bridge", "true");
		apiParams.getJSONObject("Options").accumulate("com.docker.network.bridge.enable_icc", "true");
		apiParams.getJSONObject("Options").accumulate("com.docker.network.bridge.enable_ip_masquerade", "true");
		apiParams.getJSONObject("Options").accumulate("com.docker.network.bridge.host_binding_ipv4", "0.0.0.0");
		apiParams.getJSONObject("Options").accumulate("com.docker.network.bridge.name", "docker0");
		apiParams.getJSONObject("Options").accumulate("com.docker.network.driver.mtu", "1500");*/
		
		apiParams.accumulate("Labels", new JSONObject());
		/*apiParams.getJSONObject("Labels").accumulate("com.example.some-label", "some-value");
		apiParams.getJSONObject("Labels").accumulate("com.example.some-other-label", "some-other-value");*/
		return this;
	}
	
	public NetworkCreate name(String name) {
		apiParams.element("Name", name);
		return this;
	}
	
	public NetworkCreate ipv6(boolean  enableIpv6) { 
		apiParams.element("EnableIPv6", enableIpv6);
		return this;
	}
	
	public NetworkCreate driver(String  driver) { //driver to manage the Network (default "bridge")
		apiParams.element("Driver", driver);
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
