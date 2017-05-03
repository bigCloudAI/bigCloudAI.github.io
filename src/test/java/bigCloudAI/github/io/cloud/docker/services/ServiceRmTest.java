package bigCloudAI.github.io.cloud.docker.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceRmTest {

	@Autowired
	ServiceRm serviceRm;
	
	@Test
	public void test() {
		serviceRm.rm("1493694632651").send("192.168.80.200:2375");
	}
}
