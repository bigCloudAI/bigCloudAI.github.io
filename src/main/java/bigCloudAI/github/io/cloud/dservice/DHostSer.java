package bigCloudAI.github.io.cloud.dservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import bigCloudAI.github.io.cloud.entity.DHost;

@Component
public class DHostSer {

	@Autowired
	private RestTemplate template;

	public void testJson() {
			// TODO Auto-generated method stub
		DHost jsonObject =  template.getForObject("http://192.168.0.100:2375/info", DHost.class);
    System.out.println(jsonObject.getNGoroutines());
    System.out.println(jsonObject.getnFd());

   }

}
