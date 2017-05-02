
package bigCloudAI.github.io.cloud.dservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import bigCloudAI.github.io.cloud.dservice.DHostSer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SerServiceTest {
	@Autowired
	DHostSer serService;
	
	@Test
	public void createService(){
		serService.testJson();
	}
}
