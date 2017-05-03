package bigCloudAI.github.io.cloud.docker.networks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NetworkRmTest {

	@Autowired
	NetworkRm networkRm;
	
	@Test
	public void test() {
		 networkRm.rm("a3b931c2051e").send("192.168.80.103:2375");
	}
}
