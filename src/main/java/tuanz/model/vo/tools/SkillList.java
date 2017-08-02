package tuanz.model.vo.tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import tuanz.model.vo.base.Skill;

import java.util.*;

import static tuanz.core.constant.PCConstant.SKILLDEFAULT;
import static tuanz.core.constant.PCConstant.SKILLNAME;

/**
 * Created by Yxm on 2017/7/31.
 */
public class SkillList {
    private Map<String, Skill> allSkill;
    private Map<String, Skill> listUnstudy;
    private Map<String, Skill> listStudy;
    private Map<String, Skill> listCanStudy;

    public SkillList(){
        allSkill = new HashMap<String, Skill>();
        listUnstudy = new HashMap<String, Skill>();
        listStudy = new HashMap<String, Skill>();
        listCanStudy = new HashMap<String, Skill>();
    }

    public void init(){
        for(int i =0;i<SKILLNAME.length;i++) {
            Skill skill = new Skill();
            skill.setSkillId(i);
            skill.setSkillName(SKILLNAME[i]);
            skill.setSkillValue(SKILLDEFAULT[i]);
            skill.setStudied(false);
            allSkill.put(SKILLNAME[i], skill);
        }
    }

    public Map<String, Skill> getListCanStudy(Integer[] canStudy){
        listCanStudy.clear();
        for(int i = 0;i<canStudy.length;i++){
            for(Skill s : allSkill.values()){
                if(s.getSkillId()==canStudy[i]){
                    listCanStudy.put(s.getSkillName(),s);
                    break;
                }
            }
        }


        return listCanStudy;
    }

    public Map<String, Skill> getListStudy(){
        listStudy.clear();
        for(Skill s : allSkill.values()){
            if(s.getStudied())
                listStudy.put(s.getSkillName(),s);
        }
        return listStudy;
    }

    public Map<String, Skill> getListUnstudy(){
        listUnstudy.clear();
        for(Skill s : allSkill.values()){
            if(!s.getStudied())
                listUnstudy.put(s.getSkillName(),s);
        }
        return listUnstudy;
    }

    public Map<String, Skill> getAllSkill() {
        return allSkill;
    }

    public void setAllSkill(String jsonStr) {
        this.allSkill = JSON.parseObject(jsonStr, new TypeReference<Map<String, Skill>>() {});
    }

    public void setAllSkill(Map<String, Skill> allSkill) {
        this.allSkill = allSkill;
    }

    public void setListUnstudy(Map<String, Skill> listUnstudy) {
        this.listUnstudy = listUnstudy;
    }

    public void setListStudy(Map<String, Skill> listStudy) {
        this.listStudy = listStudy;
    }

    public void study(String skillName, Integer skillValue){
        Skill skill = allSkill.get(skillName);
        skill.setSkillValue(skillValue);
        skill.setStudied(true);
    }

    public void defindSkill(String preSkillName, String defineSkillName){
        Skill skill = allSkill.get(preSkillName);
        skill.setSkillName(defineSkillName);
        skill.setStudied(true);
        allSkill.remove(preSkillName);
        allSkill.put(preSkillName,skill);
    }

    public List<Skill> getJsonListStudy(){
        List<Skill> studylist = new ArrayList<>();
        for(Skill s : allSkill.values()){
            if(s.getStudied())
                studylist.add(s);
        }
        return studylist;
    }

    public List<Skill> getJsonListUnstudy(){
        List<Skill> unstudylist = new ArrayList<>();
        for(Skill s : allSkill.values()){
            if(!s.getStudied())
                unstudylist.add(s);
        }
        return unstudylist;
    }
}
