package final_blog.repo;

import org.springframework.data.repository.CrudRepository;

import final_blog.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	

}
