package bigCloudAI.github.io.cloud.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.RepositoryDefinition;

import bigCloudAI.github.io.cloud.entity.DCluster;

@RepositoryDefinition(domainClass = DCluster.class, idClass = Long.class)
public interface DClusterRepository {// extends
										// Repository<PurviewRoleAction,Long>{

	DCluster save(DCluster dCluster);

	Page<DCluster> findAll(Pageable pageable);

}