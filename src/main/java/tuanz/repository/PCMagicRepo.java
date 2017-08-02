package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tuanz.model.pc.PCMagic;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCMagicRepo extends JpaRepository<PCMagic, Integer> {
    @Query("select magic from PCMagic magic where magic.PCId = :PCId")
    PCMagic findByPCId(@Param("PCId")Integer PCId);

}
