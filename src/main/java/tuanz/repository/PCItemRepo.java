package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tuanz.model.pc.PCItem;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCItemRepo extends JpaRepository<PCItem, Integer> {
    @Query("select item from PCItem item where item.PCId = :PCId")
    PCItem findByPCId(@Param("PCId")Integer PCId);

}
