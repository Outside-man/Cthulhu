package tuanz.service.pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tuanz.model.pc.PC;
import tuanz.model.pc.PCMagic;
import tuanz.repository.PCMagicRepo;
import tuanz.repository.PCRepo;

/**
 * Created by Yxm on 2017/8/3.
 */
@Component
public class PCMagicService {
    @Autowired
    private PCMagicRepo pcMagicRepo;
    @Autowired
    private PCRepo pcRepo;
    //初始化PC魔法
    public PCMagic initPCMagic(Integer pcId){
        PC pc = pcRepo.findOne(pcId);
        if(pc==null||pc.getMagicId()!=null) return null;
        PCMagic pcMagic = new PCMagic();
        pcMagic.setPCId(pcId);
        pcMagic.setListMagic("");
        pcMagic = pcMagicRepo.saveAndFlush(pcMagic);
        pc.setMagicId(pcMagic.getId());
        pcRepo.saveAndFlush(pc);
        return pcMagic;
    }

    public PCMagic getPCMagic(Integer pcId){
        return pcMagicRepo.findByPCId(pcId);
    }
}
