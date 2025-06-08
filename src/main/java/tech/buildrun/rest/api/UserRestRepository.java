package tech.buildrun.rest.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tech.buildrun.rest.entity.UserEntity;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(
        path = "users",
        collectionResourceRel = "users"
)
public interface UserRestRepository extends
        CrudRepository<UserEntity, UUID>,
        PagingAndSortingRepository<UserEntity, UUID> {

    List<UserEntity> findByName(@Param("name") String name);
 }
