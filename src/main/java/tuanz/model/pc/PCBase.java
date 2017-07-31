package tuanz.model.pc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by Yxm on 2017/7/31.
 */
@Entity
public class PCBase{
    @javax.persistence.Id
    @GeneratedValue
    private Integer Id;

    private Integer PCId;

    private String Icon;//头像

    private String Name;//姓名

    private String Job;//职业

    private String Sex;//性别

    private String Hometwon;//出生地

    private Integer Age;//年龄

    private Integer hpLimit;

    private Integer hpNow;

    private Integer mpLimit;

    private Integer mpNow;

    private Integer sanLimit;

    private Integer sanNow;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getPCId() {
        return PCId;
    }

    public void setPCId(Integer PCId) {
        this.PCId = PCId;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getHometwon() {
        return Hometwon;
    }

    public void setHometwon(String hometwon) {
        Hometwon = hometwon;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getHpLimit() {
        return hpLimit;
    }

    public void setHpLimit(Integer hpLimit) {
        this.hpLimit = hpLimit;
    }

    public Integer getHpNow() {
        return hpNow;
    }

    public void setHpNow(Integer hpNow) {
        this.hpNow = hpNow;
    }

    public Integer getMpLimit() {
        return mpLimit;
    }

    public void setMpLimit(Integer mpLimit) {
        this.mpLimit = mpLimit;
    }

    public Integer getMpNow() {
        return mpNow;
    }

    public void setMpNow(Integer mpNow) {
        this.mpNow = mpNow;
    }

    public Integer getSanLimit() {
        return sanLimit;
    }

    public void setSanLimit(Integer sanLimit) {
        this.sanLimit = sanLimit;
    }

    public Integer getSanNow() {
        return sanNow;
    }

    public void setSanNow(Integer sanNow) {
        this.sanNow = sanNow;
    }
}
