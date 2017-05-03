package bigCloudAI.github.io.cloud.docker.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceInspectTest {

	@Autowired
	ServiceInspect serviceInspect;
	
	@Test
	public void test() {
		JSONObject jsonObject = serviceInspect.inspect("ry7xnplztd98").send("192.168.80.103:2375");
		System.out.println(jsonObject);
	}
}
