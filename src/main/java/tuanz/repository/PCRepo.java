package tuanz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tuanz.model.pc.PC;

/**
 * Created by Yxm on 2017/7/30.
 */
public interface PCRepo extends JpaRepository<PC, Integer> {

}
