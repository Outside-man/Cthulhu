package tuanz.model.pc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by Yxm on 2017/7/31.
 */
@Entity
public class PCInfo {
    @javax.persistence.Id
    @GeneratedValue
    private Integer Id;

    private Integer PCId;

    private Integer jobId;

    private Integer Charact1;

    private Integer Charact2;

    private String Psychogeny;

    private String Memo;

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

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getCharact1() {
        return Charact1;
    }

    public void setCharact1(Integer charact1) {
        Charact1 = charact1;
    }

    public Integer getCharact2() {
        return Charact2;
    }

    public void setCharact2(Integer charact2) {
        Charact2 = charact2;
    }

    public String getPsychogeny() {
        return Psychogeny;
    }

    public void setPsychogeny(String psychogeny) {
        Psychogeny = psychogeny;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }
}
