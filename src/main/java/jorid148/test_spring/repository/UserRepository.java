package jorid148.test_spring.repository;

import jorid148.test_spring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
