package restrospace.restrospace.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import restrospace.restrospace.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select * from Users where User_id=:userid",nativeQuery = true)
    User findByUserid(@Param("userid") int userid);

    
}
