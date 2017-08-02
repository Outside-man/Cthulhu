package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tuanz.model.pc.PCBase;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCBaseRepo extends JpaRepository<PCBase, Integer> {
    @Query("select base from PCBase base where base.PCId = :PCId")
    PCBase findByPCId(@Param("PCId")Integer PCId);
}
