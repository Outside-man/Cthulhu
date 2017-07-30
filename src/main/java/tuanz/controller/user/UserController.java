package tuanz.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tuanz.controller.Base.BaseController;
import tuanz.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * Created by Yxm on 2017/7/30.
 */
@Controller
public class UserController extends BaseController {
    @RequestMapping(value = {"","/","/index"},method = GET)
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        response.setHeader("Access-Control-Allow-Origin", "*");
        if(getCurrentUser(request)!=null){
            return ajaxReturn(response,10,null,0);
        }else{
            return ajaxReturn(response, -10,null,-1);
        }
    }
    @RequestMapping(value = {"/login"},method = POST)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model,
                        @RequestParam("username")String username,
                        @RequestParam("password")String password){
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(username);
        System.out.println(password);
        if(getCurrentUser(request)!=null){
            return ajaxReturn(response,10,null,0);
        }else{
            User user = new User("aaa","111");
            setCurrentUser(request,user);
            return ajaxReturn(response, "login",null,0);
        }
    }
}
