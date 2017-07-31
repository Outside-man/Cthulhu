package tuanz.service.user;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.junit.Test;
import tuanz.model.struct.base.Skill;
import tuanz.model.struct.collection.SkillList;

import java.util.Map;

/**
 * Created by Yxm on 2017/7/30.
 */
public class UserServiceTest {
    private UserService userService = new UserService();
    @Test
    public void logincheck() throws Exception {
        SkillList skillList = new SkillList();
        skillList.study("医学",100);
        String str = JSON.toJSONString(skillList.getAllSkill());
        Map<String, Skill> map = JSON.parseObject(str, new TypeReference<Map<String, Skill>>() {});
        for(Skill s : map.values()){
            if(s.getStudied())
            System.out.println(s.getSkillName()+" "+s.getSkillValue());
        }



    }

}