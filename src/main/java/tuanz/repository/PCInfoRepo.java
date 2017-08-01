package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tuanz.model.pc.PCInfo;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCInfoRepo extends JpaRepository<PCInfo, Integer> {

}
