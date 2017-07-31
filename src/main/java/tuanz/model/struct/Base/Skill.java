package tuanz.model.struct.base;

/**
 * Created by Yxm on 2017/7/31.
 */
public class Skill {
    private String skillName;

    private Integer skillValue;

    private Boolean isStudied;

    private Boolean canStudy;

    private Boolean canInterest;

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Integer getSkillValue() {
        return skillValue;
    }

    public void setSkillValue(Integer skillValue) {
        this.skillValue = skillValue;
    }

    public Boolean getStudied() {
        return isStudied;
    }

    public void setStudied(Boolean studied) {
        isStudied = studied;
    }

    public Boolean getCanStudy() {
        return canStudy;
    }

    public void setCanStudy(Boolean canStudy) {
        this.canStudy = canStudy;
    }

    public Boolean getCanInterest() {
        return canInterest;
    }

    public void setCanInterest(Boolean canInterest) {
        this.canInterest = canInterest;
    }
}
