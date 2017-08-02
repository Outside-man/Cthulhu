package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tuanz.model.pc.PC;

import java.util.List;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCRepo extends JpaRepository<PC, Integer> {
    @Query("select pc from PC pc where pc.userId = :userId")
    List<PC> findAllByUserId(@Param("userId") Integer userId);

}
