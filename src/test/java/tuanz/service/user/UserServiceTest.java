package tuanz.service.user;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tuanz.model.pc.PCAttr;
import tuanz.model.vo.base.Skill;
import tuanz.model.vo.tools.SkillList;
import tuanz.service.pc.PCAttrService;
import tuanz.service.pc.PCInfoService;
import tuanz.service.pc.PCSkillService;

/**
 * Created by Yxm on 2017/7/30.
 */
public class UserServiceTest {
    @Autowired
    private PCAttrService pcAttrService;
    @Autowired
    private PCInfoService pcInfoService;
    @Autowired
    private PCSkillService pcSkillService;

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

//        PCAttr pcAttr = new PCAttr(1,6,5,1,11,13,2,6,12,17);
//        SkillList skillList = new SkillList();
//        skillList.init();
//        Job job = new Job(1,pcAttr,skillList);
//        System.out.println(JSON.toJSONString(skillList.getAllSkill()));
//         PCAttr pcAttr= pcAttrService.completePCAttr(1,10,10,10,10,10,10,10,10,10);
//         pcInfoService.completePCInfo(1,7,0,0,"","");
//         pcSkillService.initPCSkill(1);
//        SkillList skillList = new SkillList();
//        skillList.init();
//        String str = JSON.toJSONString(skillList.getAllSkill());
//        skillList.setAllSkill(str);
//        skillList.defindSkill(60, "宇宙飞船");
//        for(Skill s :skillList.getAllSkill()){
//            System.out.println(s.getSkillId()+" "+s.getSkillName());
//        }

    }

}