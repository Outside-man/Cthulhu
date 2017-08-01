package tuanz.model.pc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Yxm on 2017/7/31.
 *
 * @Icon
 * @Name
 * @Job
 * @Sex
 * @Hometown
 * @Age
 *
 */

@Entity
public class PCBase{
    @Id
    @GeneratedValue
    private Integer Id;

    private Integer PCId;

    private String Icon;//头像

    private String Name;//姓名

    private String Job;//职业

    private String Sex;//性别

    private String Hometwon;//出生地

    private Integer Age;//年龄

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

}
