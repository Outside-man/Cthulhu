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
    private List<Skill> allSkill;
    private List<Skill> listUnstudy;
    private List<Skill> listStudy;
    private List<Skill> listCanStudy;

    public SkillList(){
        allSkill = new ArrayList<>();
        listUnstudy = new ArrayList<>();
        listStudy = new ArrayList<>();
        listCanStudy = new ArrayList<>();
    }

    public void init(){
        for(int i =0;i<SKILLNAME.length;i++) {
            Skill skill = new Skill();
            skill.setSkillId(i);
            skill.setSkillName(SKILLNAME[i]);
            skill.setSkillValue(SKILLDEFAULT[i]);
            skill.setStudied(false);
            allSkill.add(i, skill);
        }
    }

    public List<Skill> getListCanStudy(Integer[] canStudy){
        listCanStudy.clear();
        for(int i = 0;i<canStudy.length;i++){
            for(Skill s : allSkill){
                if(s.getSkillId()==canStudy[i]){
                    listCanStudy.add(s);
                    break;
                }
            }
        }


        return listCanStudy;
    }

    public List<Skill> getListStudy(){
        listStudy.clear();
        for(Skill s : allSkill){
            if(s.getStudied())
                listStudy.add(s);
        }
        return listStudy;
    }

    public List<Skill> getListUnstudy(){
        listUnstudy.clear();
        for(Skill s : allSkill){
            if(!s.getStudied())
                listUnstudy.add(s);
        }
        return listUnstudy;
    }

    public List<Skill> getAllSkill() {
        return allSkill;
    }

    public void setAllSkill(String jsonStr) {
        this.allSkill = JSON.parseArray(jsonStr, Skill.class);
    }

    public void setAllSkill(List<Skill> allSkill) {
        this.allSkill = allSkill;
    }



    public void study(Integer skillId, Integer skillValue) {
        Skill skill = allSkill.get(skillId);
        skill.setSkillValue(skillValue);
        skill.setStudied(true);
    }

    public void setListUnstudy(List<Skill> listUnstudy) {
        this.listUnstudy = listUnstudy;
    }

    public void setListStudy(List<Skill> listStudy) {
        this.listStudy = listStudy;
    }

    public void setListCanStudy(List<Skill> listCanStudy) {
        this.listCanStudy = listCanStudy;
    }

    public void defindSkill(Integer skillId, String defineSkillName){
        Skill skill = allSkill.get(skillId);
        skill.setSkillName(defineSkillName);
        skill.setStudied(true);
    }

    public List<Skill> getJsonListStudy(){
        List<Skill> studylist = new ArrayList<>();
        for(Skill s : allSkill){
            if(s.getStudied())
                studylist.add(s);
        }
        return studylist;
    }

    public List<Skill> getJsonListUnstudy(){
        List<Skill> unstudylist = new ArrayList<>();
        for(Skill s : allSkill){
            if(!s.getStudied())
                unstudylist.add(s);
        }
        return unstudylist;
    }
}
