package tuanz.service.pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tuanz.model.pc.PC;
import tuanz.model.pc.PCBase;
import tuanz.repository.PCRepo;
import tuanz.service.user.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * PCService
 * Created by Yxm on 2017/8/1.
 */
@Component
public class PCService {
    @Autowired
    private PCRepo pcRepo;

    @Autowired
    private UserService userService;

    @Autowired
    private PCBaseService pcBaseService;

    //创建PC
    /**
     * 1.创建PC同时完成Base
     * 2.完善Attr
     * 3.完善Info，同时根据特征和职业影响Attr和确定技能值
     * 4.点技能完善SKill
     * 5.创建Magic，Item表 PC status变为1 创建完成
     * */
    public PC create(Integer userId,String pcName, String pcJob, String pcSex, String pcHometown, Integer pcAge){
        if(!userService.userExist(userId))return null;
        //创建PC人物
        PC pc = new PC();
        pc.setUserId(userId);
        pc.setStatus(0);
        pc = pcRepo.saveAndFlush(pc);
        pcBaseService.completePCBase(pc.getId(),pcName,pcJob,pcSex,pcHometown,pcAge);
        return pc;
    }

    public Map<PC,PCBase> getPCList(Integer userId){
        if(!userService.userExist(userId))return null;
        Map<PC, PCBase> map = new HashMap<>();
        List<PC> listPC = pcRepo.findAllByUserId(userId);
        for(PC p : listPC){
            try {
                PCBase base = pcBaseService.getPCBase(p.getId());
                if(base==null) throw new Exception(p.getUserId()+"的"+p.getId()+"的base不存在");
                map.put(p,base);
            }catch (Exception e){
                System.out.println(e.getMessage());
                pcRepo.delete(p);
            }
        }
        return map;
    }

    public PC getPC(Integer pcId){
        return pcRepo.getOne(pcId);
    }

}
