package tuanz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tuanz.core.Base.BaseController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yxm on 2017/7/19.
 */
@Controller
public class Demo extends BaseController {
    @RequestMapping("demo")
    public String demo(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("hp",100);
        return "/base_info";
//        return null;
    }
}
