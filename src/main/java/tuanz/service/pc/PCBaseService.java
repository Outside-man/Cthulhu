package tuanz.service.pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tuanz.model.pc.PC;
import tuanz.model.pc.PCBase;
import tuanz.repository.PCBaseRepo;
import tuanz.repository.PCRepo;

/**
 * Created by Yxm on 2017/8/2.
 */
@Component
public class PCBaseService {
    @Autowired
    private PCRepo pcRepo;
    @Autowired
    private PCBaseRepo pcBaseRepo;

    //完善PC基础信息
    public PCBase completePCBase(Integer pcId,String pcName, String pcJob, String pcSex, String pcHometown, Integer pcAge){
        PC pc = pcRepo.findOne(pcId);
        if(pc==null||pc.getBaseId()!=null)return null;
        PCBase pcBase = new PCBase();
        pcBase.setPCId(pcId);
        pcBase.setName(pcName);
        pcBase.setJob(pcJob);
        pcBase.setSex(pcSex);
        pcBase.setHometwon(pcHometown);
        pcBase.setAge(pcAge);
        pcBase = pcBaseRepo.saveAndFlush(pcBase);
        pc.setBaseId(pcBase.getId());
        pcRepo.saveAndFlush(pc);
        return pcBase;
    }
}
