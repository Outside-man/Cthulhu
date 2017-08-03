package tuanz.model.pc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Created by Yxm on 2017/7/31.
 */
@Entity
public class PCSkill {
    @Id
    @GeneratedValue
    private Integer Id;

    private Integer PCId;

    private Integer Interest;

    private Integer Profession;

    @Column(columnDefinition = "TEXT")
    private String listStudySkill;

    @Column(columnDefinition = "TEXT")
    private String listUnStudySkill;

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

    public Integer getInterest() {
        return Interest;
    }

    public void setInterest(Integer interest) {
        Interest = interest;
    }

    public Integer getProfession() {
        return Profession;
    }

    public void setProfession(Integer profession) {
        Profession = profession;
    }

    public String getListStudySkill() {
        return listStudySkill;
    }

    public void setListStudySkill(String listStudySkill) {
        this.listStudySkill = listStudySkill;
    }

    public String getListUnStudySkill() {
        return listUnStudySkill;
    }

    public void setListUnStudySkill(String listUnStudySkill) {
        this.listUnStudySkill = listUnStudySkill;
    }
}
