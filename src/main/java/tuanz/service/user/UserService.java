package tuanz.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tuanz.model.User;
import tuanz.repository.UserRepo;

import static tuanz.core.Base.MD5.EncoderByMd5;

/**
 * Created by Yxm on 2017/7/30.
 */
@Component
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public  Boolean userExist(Integer userId){
        User user = userRepo.findOne(userId);
        if(user!=null)return true;
        return false;
    }

    public User loginCheck(String username, String password){
        User user = userRepo.findByUsername(username);
        if(user!=null&&user.getPassword().equals(EncoderByMd5(password)))
            return user;
        return null;
    }

    public Integer register(String username, String password){
        User user = new User(username,EncoderByMd5(password));
        try{
            if(userRepo.findByUsername(username)!=null)throw new Exception("账户"+username+"已存在");
            userRepo.save(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
        return 1;
    }
}

