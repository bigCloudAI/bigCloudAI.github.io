package bigCloudAI.github.io.cloud.docker.tasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.sf.json.JSONArray;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskLsTest {

	@Autowired
	TaskLs taskLs;
	
	@Test
	public void test() {
		JSONArray s = taskLs.ls().send("192.168.80.103:2375");
		System.out.println(s);
	}
}
