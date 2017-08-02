package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tuanz.model.pc.PCSkill;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCSkillRepo extends JpaRepository<PCSkill, Integer> {
    @Query("select skill from PCSkill skill where skill.PCId = :PCId")
    PCSkill findByPCId(@Param("PCId")Integer PCId);

}
