package bigCloudAI.github.io.cloud.docker.swarm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SwarmJoinTest {

	@Autowired
	SwarmJoin swarmJoin;
	
	@Test
	public void test() {
		JSONObject s = swarmJoin.join("SWMTKN-1-487xzxyemqdhnmiy6nbjriq6vzblb8wmydlb6tb07finz28ukh-85sx0s6z7o7n2yiwdo628f0jt",
				"192.168.80.103:2377").send("192.168.80.200:2375");
		System.out.println(s);
	}
}
