package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tuanz.model.User;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.Username = :Username")
    User findByUsername(@Param("Username") String Username);
}
