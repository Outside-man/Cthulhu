package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tuanz.model.pc.PCAttr;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCAttrRepo extends JpaRepository<PCAttr, Integer> {
    @Query("select attr from PCAttr attr where attr.PCId = :PCId")
    PCAttr findByPCId(@Param("PCId")Integer PCId);
}
