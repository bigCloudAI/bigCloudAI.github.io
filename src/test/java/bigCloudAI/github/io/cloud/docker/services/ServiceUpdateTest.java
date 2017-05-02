package bigCloudAI.github.io.cloud.docker.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceUpdateTest {

	@Autowired
	ServiceUpdate serviceUpdate;
	
	@Test
	public void test() {
		serviceUpdate.update("ry7xnplztd98","192.168.80.103:2375").scale(2).send("192.168.80.103:2375");
	}
}
