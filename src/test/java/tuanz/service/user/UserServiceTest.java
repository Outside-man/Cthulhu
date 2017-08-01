package tuanz.service.user;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import tuanz.model.struct.tools.SkillList;

/**
 * Created by Yxm on 2017/7/30.
 */
public class UserServiceTest {
    private UserService userService = new UserService();
    @Test
    public void logincheck() throws Exception {
        SkillList skillList = new SkillList();
        skillList.init();
        String str = JSON.toJSONString(skillList.getAllSkill());
        System.out.println(str);
        SkillList skillList1 = new SkillList();
        skillList1.setAllSkill(str);
        skillList1.defindSkill("drive","老司机开车");
        System.out.println(JSON.toJSONString(skillList1.getListStudy()));


    }

}