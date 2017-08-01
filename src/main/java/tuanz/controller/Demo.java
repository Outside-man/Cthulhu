package tuanz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tuanz.controller.Base.BaseController;
import tuanz.model.pc.PCAttr;
import tuanz.service.pc.PCAttrService;
import tuanz.service.pc.PCInfoService;
import tuanz.service.pc.PCService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yxm on 2017/7/19.
 */
@Controller
public class Demo extends BaseController {

    @Autowired
    private PCService pcService;
    @Autowired
    private PCInfoService pcInfoService;
    @Autowired
    private PCAttrService pcAttrService;
    @RequestMapping("demo")
    public String demo(HttpServletRequest request, HttpServletResponse response, Model model){
        response.setHeader("Access-Control-Allow-Origin", "*");
//        SkillList skillList = new SkillList();
//        skillList.init();
//        String str = JSON.toJSONString(skillList.getAllSkill());
//        SkillList skillList1 = new SkillList();
//        skillList1.setAllSkill(str);
//        skillList1.defindSkill("drive","老司机开车");
//        System.out.println(JSON.toJSONString(skillList1.getListStudy()));
//        return ajaxReturn(response,skillList1.getJsonListUnstudy());
//        model.addAttribute("skill",skillList1.getJsonListStudy());
//        return "base_skill";
//        PC pc = pcService.create(1,"小田君","警务员","男","东京",18);
////        if(pc!=null)
//        pcInfoService.completePCInfo(1,1,10,2,"精神障碍", "备注");
        PCAttr pcAttr = pcAttrService.completePCAttr(1,6,5,1,11,2,6,12,17);
        return ajaxReturn(response,pcAttr);
    }
}
