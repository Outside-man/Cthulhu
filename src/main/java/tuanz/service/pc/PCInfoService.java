package tuanz.service.pc;

/**
 * Created by Yxm on 2017/8/2.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tuanz.model.pc.PC;
import tuanz.model.pc.PCInfo;
import tuanz.repository.PCInfoRepo;
import tuanz.repository.PCRepo;


@Component
public class PCInfoService {
    @Autowired
    private PCRepo pcRepo;
    @Autowired
    private PCInfoRepo pcInfoRepo;

    //完善PC信息
    public PCInfo completePCInfo(Integer pcId, Integer jobId, Integer Charact1, Integer Charact2, String Psychogeny,String Memo){
        PC pc = pcRepo.findOne(pcId);
        if(pc==null||pc.getInfoId()!=null)return null;

        PCInfo pcInfo = new PCInfo();
        pcInfo.setPCId(pcId);
        pcInfo.setJobId(jobId);
        pcInfo.setCharact1(Charact1);
        pcInfo.setCharact2(Charact2);
        pcInfo.setPsychogeny(Psychogeny);
        pcInfo.setMemo(Memo);//TODO 可能去掉
        pcInfo = pcInfoRepo.saveAndFlush(pcInfo);
        pc.setInfoId(pcInfo.getId());
        pcRepo.saveAndFlush(pc);
        return pcInfo;
    }

    public PCInfo getPCInfo(Integer pcId){
        return pcInfoRepo.findByPCId(pcId);
    }

}
