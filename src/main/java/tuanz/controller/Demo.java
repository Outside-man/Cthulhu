package tuanz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tuanz.controller.Base.BaseController;
import tuanz.service.user.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yxm on 2017/7/19.
 */
@Controller
public class Demo extends BaseController {

    @Autowired
    private UserService userService;
    @RequestMapping("demo")
    public String demo(HttpServletRequest request, HttpServletResponse response, Model model){
//        int status =  userService.register("yxm","123456");
//        return ajaxReturn(response,status);
        return "/base_skill";
    }
}
