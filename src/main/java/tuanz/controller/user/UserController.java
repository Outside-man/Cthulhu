package tuanz.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tuanz.controller.Base.BaseController;
import tuanz.model.User;
import tuanz.service.user.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * Created by Yxm on 2017/7/30.
 */
@Controller
public class UserController extends BaseController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = {"","/","/index"},method = GET)
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        response.setHeader("Access-Control-Allow-Origin", "*");
        if(getCurrentUser(request)!=null){
            return "redirect:/PC ";
        }else{
            return "index/login";
        }
    }
    @RequestMapping(value = {"/login"},method = POST)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model,
                        @RequestParam("username")String username,
                        @RequestParam("password")String password){
//        response.setHeader("Access-Control-Allow-Origin", "*");
        User user = userService.loginCheck(username,password);
        if(user!=null){
            setCurrentUser(request,user);
            return ajaxReturn(response,null,"登录成功",0);
        }
        return ajaxReturn(response,null,"账户或密码不正确",1);

    }
}