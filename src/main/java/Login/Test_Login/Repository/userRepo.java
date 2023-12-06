package Login.Test_Login.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Login.Test_Login.Model.Entity.userEntity;

@Repository
public interface userRepo extends JpaRepository<userEntity, Long> {

	boolean existsByEmail(String email);
	
	Optional<userEntity> findByEmail(String email);
	
}
