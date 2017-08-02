package tuanz.service.user;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import tuanz.model.pc.PCAttr;
import tuanz.model.vo.base.Job;
import tuanz.model.vo.tools.SkillList;

/**
 * Created by Yxm on 2017/7/30.
 */
public class UserServiceTest {
    private UserService userService = new UserService();
    @Test
    public void logincheck() throws Exception {
//        SkillList skillList = new SkillList();
//        skillList.init();
//        String str = JSON.toJSONString(skillList.getAllSkill());
//        System.out.println(str);
//        SkillList skillList1 = new SkillList();
//        skillList1.setAllSkill(str);
//        skillList1.defindSkill("drive","老司机开车");
//        System.out.println(JSON.toJSONString(skillList1.getListStudy()));
//        PCAttr pcAttr = new PCAttr(1,6,5,1,11,13,2,6,12,17);
//        System.out.println(pcAttr.getApp());
//        Job job = new Job();
//        job.setJobId(3);
////        job.setProfession(pcAttr);
//        System.out.println(pcAttr.getApp());

        PCAttr pcAttr = new PCAttr(1,6,5,1,11,13,2,6,12,17);
        SkillList skillList = new SkillList();
        skillList.init();
        Job job = new Job(1,pcAttr,skillList);
        System.out.println(JSON.toJSONString(skillList.getAllSkill()));
    }

}