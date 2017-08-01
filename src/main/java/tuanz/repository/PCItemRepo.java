package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tuanz.model.pc.PCItem;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCItemRepo extends JpaRepository<PCItem, Integer> {

}
