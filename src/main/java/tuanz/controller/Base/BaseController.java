package tuanz.controller.Base;

import org.springframework.ui.Model;
import tuanz.model.User;
import tuanz.model.vo.base.VOPC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static tuanz.core.constant.PCConstant.SESSION_CURRENT_PC;
import static tuanz.core.constant.UserConstant.SESSION_CURRENT_USER;

/**
 * Created by Yxm on 2017/7/3.
 */
public class BaseController extends tuanz.core.Base.BaseController {

    protected HttpSession getHttpSession(HttpServletRequest request) {
        return request.getSession();
    }

    protected User getCurrentUser(HttpServletRequest request) {
        User user = (User) getHttpSession(request).getAttribute(SESSION_CURRENT_USER);
        return user;
    }

    protected void setCurrentUser(HttpServletRequest request,User user) {
        getHttpSession(request).setAttribute(SESSION_CURRENT_USER,user);
    }

    protected VOPC getCurrentPC(HttpServletRequest request) {
        VOPC pc = (VOPC) getHttpSession(request).getAttribute(SESSION_CURRENT_PC);
        return pc;
    }

    protected void setCurrentPC(HttpServletRequest request,VOPC pc) {
        getHttpSession(request).setAttribute(SESSION_CURRENT_PC,pc);
    }

    protected String error(HttpServletRequest request, HttpServletResponse response, Model model, int status){
        return ajaxReturn(response, status);
    }
}
