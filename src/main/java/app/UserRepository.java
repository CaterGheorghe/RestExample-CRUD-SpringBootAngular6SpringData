package app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

}
