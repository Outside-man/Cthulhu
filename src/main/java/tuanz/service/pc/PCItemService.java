package tuanz.service.pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tuanz.model.pc.PC;
import tuanz.model.pc.PCItem;
import tuanz.repository.PCItemRepo;
import tuanz.repository.PCRepo;

/**
 * Created by Yxm on 2017/8/3.
 */
@Component
public class PCItemService {
    @Autowired
    private PCItemRepo pcItemRepo;
    @Autowired
    private PCRepo pcRepo;
    //初始化PC物品
    public PCItem initPCItem(Integer pcId){
        PC pc = pcRepo.findOne(pcId);
        if(pc==null||pc.getItemId()!=null) return null;
        PCItem pcItem = new PCItem();
        pcItem.setPCId(pcId);
        pcItem.setListItem("");
        pcItem = pcItemRepo.saveAndFlush(pcItem);
        pc.setItemId(pcItem.getId());
        pcRepo.saveAndFlush(pc);
        return pcItem;
    }

    public PCItem getPCItem(Integer pcId){
        return pcItemRepo.findByPCId(pcId);
    }

}
