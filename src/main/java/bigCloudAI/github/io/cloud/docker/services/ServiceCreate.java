package bigCloudAI.github.io.cloud.docker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Service
public class ServiceCreate {
	
	public static void main(String[] args) {
		ServiceCreate serviceCreate =new ServiceCreate();
		serviceCreate.setTemplate(new RestTemplate());
		JSONObject s = serviceCreate.create().name("serName3").image("192.168.80.41:5000/redis:3.0-alpine")/*.env("env")*/.mount("a:b").port(82,8080)/*.network("19udrlao4rec")*/.mode("Replicated")
				.replicas(2).send("192.168.80.200:2375");
		System.out.println(s);
	}
	
	public String getPortUrl(String ipPort){//
		/*/v1.26/*/return "http://"+ipPort+"/services/create";//host.getHostIp();
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

	public ServiceCreate create() {
		apiParams = new JSONObject();
		apiParams.accumulate("Name", "");
		apiParams.accumulate("TaskTemplate", new JSONObject());
		apiParams.getJSONObject("TaskTemplate").accumulate("ContainerSpec", new JSONObject());
		apiParams.getJSONObject("TaskTemplate").getJSONObject("ContainerSpec").accumulate("Env", new JSONArray());
		/*
		 * \"user=admin\",\"u=2\",\"rt\"
		 */ apiParams.getJSONObject("TaskTemplate").getJSONObject("ContainerSpec").accumulate("Image", "");
		apiParams.getJSONObject("TaskTemplate").getJSONObject("ContainerSpec").accumulate("Mounts", new JSONArray());
		// apiParams.getJSONObject("TaskTemplate").getJSONObject("ContainerSpec").getJSONArray("Mounts").add(new
		// JSONObject());
		// .accumulate("ReadOnly", true).accumulate("Source",
		// "").accumulate("Target", "").accumulate("Type",
		// "volume").accumulate("VolumeOptions", new JSONObject())

		apiParams.getJSONObject("TaskTemplate").getJSONObject("ContainerSpec").accumulate("User", "33");
		apiParams.getJSONObject("TaskTemplate").getJSONObject("ContainerSpec").accumulate("DNSConfig",
				new JSONObject());

		apiParams.getJSONObject("TaskTemplate").accumulate("LogDriver", new JSONObject().accumulate("Name", "json-file")
				.accumulate("Options", new JSONObject().accumulate("max-file", "3").accumulate("max-size", "10M")));

		apiParams.getJSONObject("TaskTemplate").accumulate("Placement", new JSONObject());

		apiParams.getJSONObject("TaskTemplate").accumulate("Resources",
				new JSONObject().accumulate("Limits", new JSONObject().accumulate("MemoryBytes", 104857600))
						.accumulate("Reservations", new JSONObject()));

		apiParams.getJSONObject("TaskTemplate").accumulate("RestartPolicy", new JSONObject()
				.accumulate("Condition", "on-failure").accumulate("Delay", 10000000000L).accumulate("MaxAttempts", 10));

		// apiParams.getJSONObject("Mode").accumulate("Global",new
		// JSONObject());

		apiParams.accumulate("Mode", new JSONObject());
		apiParams.getJSONObject("Mode").accumulate("Replicated", new JSONObject().accumulate("Replicas", 1));
		// apiParams.getJSONObject("Mode").getJSONObject("Replicated").accumulate("Replicas",1);

		apiParams.accumulate("Networks", new JSONArray());// [{'Target':'8my0ny315m61bocrtpqfosp2e'}]
		// apiParams.getJSONArray("Networks").add(new
		// JSONObject().accumulate("Target", ""));

		apiParams.accumulate("EndpointSpec", new JSONObject());
		apiParams.getJSONObject("EndpointSpec").accumulate("Ports", new JSONArray());
		// apiParams.getJSONObject("EndpointSpec").getJSONArray("Ports").add(new
		// JSONObject());//.accumulate("Protocol",
		// "tcp").accumulate("PublishedPort", "").accumulate("TargetPort", "")

		/*
		 * apiParams.accumulate("UpdateConfig", new JSONObject());
		 * apiParams.accumulate("RollbackConfig", new JSONObject());
		 * apiParams.accumulate("Labels", new JSONObject());
		 */
		return this;
	}

	public ServiceCreate replicas(int replicas) {
		apiParams.getJSONObject("Mode").getJSONObject("Replicated").element("Replicas", replicas);
		return this;
	}

	public ServiceCreate image(String iamgeName) {
		apiParams.getJSONObject("TaskTemplate").getJSONObject("ContainerSpec").element("Image", iamgeName);
		return this;
	}

	public ServiceCreate env(String env) {/* user=2 */
		apiParams.getJSONObject("TaskTemplate").getJSONObject("ContainerSpec").getJSONArray("Env").add(env);
		return this;
	}

	public ServiceCreate name(String name) {
		apiParams.element("Name", name);
		return this;
	}

	public ServiceCreate port(String port) {// 8080:80
		if (port.split(":").length < 2) {
			return this;
		}
		return port(Integer.parseInt(port.split(":")[0]), Integer.parseInt(port.split(":")[1]));
	}

	public ServiceCreate port(int publishedPort, int targetPort) {// 8080:80
		apiParams.getJSONObject("EndpointSpec").getJSONArray("Ports").add(new JSONObject().accumulate("Protocol", "tcp")
				.accumulate("PublishedPort", publishedPort).accumulate("TargetPort", targetPort));
		return this;
	}

	public ServiceCreate network(String network) {
		apiParams.getJSONArray("Networks").add(new JSONObject().accumulate("Target", network));
		return this;
	}

	public ServiceCreate mount(String mount) {// var/hostdata:var/condata
		if (mount.split(":").length < 2) {
			return this;
		}
		return mount(mount.split(":")[0], mount.split(":")[1]);
	}

	public ServiceCreate mount(String source, String target) {// var/hostdata:var/condata
		apiParams.getJSONObject("TaskTemplate").getJSONObject("ContainerSpec").getJSONArray("Mounts")
				.add(new JSONObject().accumulate("Source", source).accumulate("Target", target)
						.accumulate("Type", "volume").accumulate("ReadOnly", true)
						.accumulate("VolumeOptions", new JSONObject()));
		return this;
	}

	public ServiceCreate mode(String mode) {
		if (mode.equals("Global")) {
			apiParams.getJSONObject("Mode").clear();
			apiParams.getJSONObject("Mode").accumulate(mode, new JSONObject());
			return this;
		}
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
