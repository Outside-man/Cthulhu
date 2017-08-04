package tuanz.service.pc;

/**
 * Created by Yxm on 2017/8/2.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tuanz.model.pc.PC;
import tuanz.model.pc.PCAttr;
import tuanz.repository.PCAttrRepo;
import tuanz.repository.PCRepo;


@Component
public class PCAttrService {
    @Autowired
    private PCRepo pcRepo;
    @Autowired
    private PCAttrRepo pcAttrRepo;

    //完善PC属性
    public PCAttr completePCAttr(Integer pcId, Integer str, Integer dex, Integer con, Integer pow,
                                 Integer app, Integer intell, Integer body, Integer edu, Integer money){
        PC pc = pcRepo.findOne(pcId);
        if(pc==null||pc.getAttrId()!=null)return null;

        PCAttr pcAttr = new PCAttr(pc.getId(), str, dex, con, pow, app, intell, body, edu, money);
        pcAttr = pcAttrRepo.saveAndFlush(pcAttr);
        pc.setAttrId(pcAttr.getId());
        pcRepo.saveAndFlush(pc);
        return pcAttr;
    }

    public PCAttr getPCAttr(Integer pcId){
        return pcAttrRepo.findByPCId(pcId);
    }

    public PCAttr savePCAttr(PCAttr pcAttr){
        return pcAttrRepo.save(pcAttr);
    }

    public PCAttr saveBaseAttr(Integer id, Integer nowHp, Integer limtHp, Integer nowMp, Integer limtMp,
                               Integer nowSan, Integer limtSan){
        PCAttr attr = pcAttrRepo.findOne(id);
        attr.setHpNow(nowHp);
        attr.setHpLimit(limtHp);
        attr.setMpNow(nowMp);
        attr.setMpLimit(limtMp);
        attr.setSanNow(nowSan);
        attr.setSanLimit(limtSan);
        pcAttrRepo.saveAndFlush(attr);
        return attr;
    }
}
