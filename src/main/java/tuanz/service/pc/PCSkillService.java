package tuanz.service.pc;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tuanz.model.pc.PC;
import tuanz.model.pc.PCAttr;
import tuanz.model.pc.PCInfo;
import tuanz.model.pc.PCSkill;
import tuanz.model.vo.base.Job;
import tuanz.model.vo.tools.SkillList;
import tuanz.repository.PCRepo;
import tuanz.repository.PCSkillRepo;

/**
 * Created by Yxm on 2017/8/2.
 */
@Component
public class PCSkillService {
    @Autowired
    private PCRepo pcRepo;
    @Autowired
    private PCSkillRepo pcSkillRepo;
    @Autowired
    private PCInfoService pcInfoService;
    @Autowired
    private PCAttrService pcAttrService;

    //初始化PC技能
    public PCSkill initPCSkill(Integer pcId){
        PC pc = pcRepo.findOne(pcId);
        if(pc==null||pc.getAttrId()==null||pc.getInfoId()==null||pc.getSkillId()!=null)return null;
        PCInfo info = pcInfoService.getPCInfo(pcId);
        PCAttr attr = pcAttrService.getPCAttr(pcId);
        SkillList skillList = new SkillList();
        skillList.init();
        Job job = new Job(info.getJobId(),attr,skillList);
        PCSkill pcSkill = new PCSkill();
        pcSkill.setPCId(pcId);
        pcSkill.setInterest(attr.getIntell()*10);
        pcSkill.setProfession(job.getProfession());
        pcSkill.setListStudySkill(JSON.toJSONString(skillList.getListStudy()));
        pcSkill.setListUnStudySkill(JSON.toJSONString(skillList.getListUnstudy()));
        pcSkill = pcSkillRepo.saveAndFlush(pcSkill);
        pc.setSkillId(pcSkill.getId());
        pcRepo.saveAndFlush(pc);
        return pcSkill;
    }
    public PCSkill getPCSkill(Integer pcId){
        return pcSkillRepo.findByPCId(pcId);
    }
}
