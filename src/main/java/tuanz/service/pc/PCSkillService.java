package tuanz.service.pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tuanz.model.pc.PC;
import tuanz.model.pc.PCSkill;
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

    //完善PC属性 TODO 实现PC Skill表创建
    public PCSkill completePCSkill(Integer pcId){
        PC pc = pcRepo.findOne(pcId);
        if(pc==null||pc.getAttrId()!=null)return null;

        PCSkill pcSkill = new PCSkill();


        return pcSkill;
    }
    public PCSkill getPCSkill(Integer pcId){
        return pcSkillRepo.findByPCId(pcId);
    }
}
