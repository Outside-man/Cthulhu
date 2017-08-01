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

    /*
    private Integer Str;//力量
    private Integer Dex;//敏捷
    private Integer Con;//体质
    private Integer Pow;//意志
    private Integer Intell;//智力
    private Integer Body;//体型
    private Integer Edu;//教育
    private Integer Ins;//灵感
    private Integer Luck;//幸运
    private Integer Know;//知识
    private Integer Money;//财富
    private Integer cthulhuKnow;//克苏鲁知识
    private Integer hpLimit;
    private Integer hpNow;
    private Integer mpLimit;
    private Integer mpNow;
    private Integer sanLimit;
    private Integer sanNow;
    */
    //完善PC属性
    public PCAttr completePCAttr(Integer pcId, Integer str, Integer dex, Integer con, Integer pow,
                                 Integer intell, Integer body, Integer edu, Integer money){
        PC pc = pcRepo.findOne(pcId);
        if(pc==null||pc.getAttrId()!=null)return null;

        PCAttr pcAttr = new PCAttr(pc.getId(), str, dex, con, pow,intell, body, edu, money);
        pcAttr = pcAttrRepo.saveAndFlush(pcAttr);
        pc.setAttrId(pcAttr.getId());
        pcRepo.saveAndFlush(pc);
        return pcAttr;
    }


}
