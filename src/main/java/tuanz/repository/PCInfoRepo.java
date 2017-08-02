package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tuanz.model.pc.PCInfo;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCInfoRepo extends JpaRepository<PCInfo, Integer> {
    @Query("select info from PCInfo info where info.PCId = :PCId")
    PCInfo findByPCId(@Param("PCId")Integer PCId);

}
