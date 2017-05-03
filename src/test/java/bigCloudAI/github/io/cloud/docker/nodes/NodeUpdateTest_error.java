package bigCloudAI.github.io.cloud.docker.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NodeUpdateTest_error {

	@Autowired
	NodeUpdate nodeUpdate;
	
	@Test
	public void test() { 
		nodeUpdate.update("f9lav5dyv37tpowzlu3ziex7p").send("192.168.80.103:2375");
	}
}
