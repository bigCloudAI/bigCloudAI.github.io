package bigCloudAI.github.io.cloud.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import bigCloudAI.github.io.cloud.entity.DCluster;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DClusterRepositoryTest {

	@Autowired
	DClusterRepository dClusterRepository;
	
	@Test
	public void test() {
		DCluster d =  dClusterRepository.save(new DCluster());
		System.out.println(d.getId());
	}
}
