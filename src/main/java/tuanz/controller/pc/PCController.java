package tuanz.controller.pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tuanz.controller.Base.BaseController;
import tuanz.model.pc.*;
import tuanz.model.vo.base.VOPC;
import tuanz.service.pc.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Yxm on 2017/8/2.
 */
@Controller
@RequestMapping(value = {"/PC"})
public class PCController extends BaseController{
    @Autowired
    private PCService pcService;
    @Autowired
    private PCBaseService pcBaseService;
    @Autowired
    private PCInfoService pcInfoService;
    @Autowired
    private PCAttrService pcAttrService;
    @Autowired
    private PCSkillService pcSkillService;
    @Autowired
    private PCItemService pcItemService;
    @Autowired
    private PCMagicService pcMagicService;

    @RequestMapping(value = {"","/","/list"},method = GET)
    public String pclist(HttpServletRequest request, HttpServletResponse response, Model model){
        if(getCurrentUser(request)!=null){
            if(getCurrentPC(request)!=null) return "redirect:/pcInfo ";
            Map<PC,PCBase> map = pcService.getPCList(getCurrentUser(request).getId());
            model.addAttribute("pcList",map);
            return "pc/pc_list";
        }else{
            return "redirect:/index ";
        }
    }

    @RequestMapping(value = {"/usePc"},method = POST)
    public String usePc(HttpServletRequest request, HttpServletResponse response, Model model,
                        @RequestParam("pcId")Integer pcId){
        System.out.println(pcId);
        if(getCurrentUser(request)!=null){
            VOPC vo = new VOPC();
            PC pc = pcService.getPC(pcId);
            PCBase base = pcBaseService.getPCBase(pcId);
            PCInfo info = pcInfoService.getPCInfo(pcId);
            PCSkill skill = pcSkillService.getPCSkill(pcId);
            PCAttr attr = pcAttrService.getPCAttr(pcId);
            PCItem item = pcItemService.getPCItem(pcId);
            PCMagic magic = pcMagicService.getPCMagic(pcId);
            vo.setPc(pc);
            vo.setBase(base);
            vo.setInfo(info);
            vo.setAttr(attr);
            vo.setSkill(skill);
            vo.setMagic(magic);
            vo.setItem(item);
            setCurrentPC(request,vo);
            return ajaxReturn(response,pcId,"使用"+pcId+"人物卡",0);
        }else{
            return ajaxReturn(response,null,"error",-1);
        }
    }

    @RequestMapping(value = {"/pcInfo"},method = GET)
    public String pcInfo(HttpServletRequest request, HttpServletResponse response, Model model){
        if(getCurrentUser(request)!=null&&getCurrentPC(request)!=null){
            model.addAttribute("pc",getCurrentPC(request).getPc());
            model.addAttribute("base",getCurrentPC(request).getBase());
            model.addAttribute("attr",getCurrentPC(request).getAttr());
            model.addAttribute("info",getCurrentPC(request).getInfo());
            return "pc/base_info";
        }else{
            return "redirect:/index ";
        }
    }



}

