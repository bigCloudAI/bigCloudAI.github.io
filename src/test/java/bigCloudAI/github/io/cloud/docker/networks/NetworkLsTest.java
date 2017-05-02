package bigCloudAI.github.io.cloud.docker.networks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.sf.json.JSONArray;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NetworkLsTest {

	@Autowired
	NetworkLs networkLs;
	
	@Test
	public void test() {
		JSONArray s = networkLs.ls().send("192.168.80.200:2375");
		System.out.println(s);
	}
}
