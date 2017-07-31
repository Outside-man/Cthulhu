package tuanz.model.pc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by Yxm on 2017/7/31.
 */
@Entity
public class PCAttr {
    @javax.persistence.Id
    @GeneratedValue
    private Integer Id;

    private Integer PCId;

    private Integer Str;//力量

    private Integer Dex;//敏捷

    private Integer Con;//体质

    private Integer Pow;//意志

    private Integer Intell;//智力

    private Integer Body;//体型

    private Integer Edu;//教育

    private Integer Ins;//灵感

    private Integer Luck;//幸运

    private Integer Know;//知识

    private Integer Money;//财富

    private Integer cthulhuKnow;//克苏鲁知识

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

    public Integer getStr() {
        return Str;
    }

    public void setStr(Integer str) {
        Str = str;
    }

    public Integer getDex() {
        return Dex;
    }

    public void setDex(Integer dex) {
        Dex = dex;
    }

    public Integer getCon() {
        return Con;
    }

    public void setCon(Integer con) {
        Con = con;
    }

    public Integer getPow() {
        return Pow;
    }

    public void setPow(Integer pow) {
        Pow = pow;
    }

    public Integer getIntell() {
        return Intell;
    }

    public void setIntell(Integer intell) {
        Intell = intell;
    }

    public Integer getBody() {
        return Body;
    }

    public void setBody(Integer body) {
        Body = body;
    }

    public Integer getEdu() {
        return Edu;
    }

    public void setEdu(Integer edu) {
        Edu = edu;
    }

    public Integer getIns() {
        return Ins;
    }

    public void setIns(Integer ins) {
        Ins = ins;
    }

    public Integer getLuck() {
        return Luck;
    }

    public void setLuck(Integer luck) {
        Luck = luck;
    }

    public Integer getKnow() {
        return Know;
    }

    public void setKnow(Integer know) {
        Know = know;
    }

    public Integer getMoney() {
        return Money;
    }

    public void setMoney(Integer money) {
        Money = money;
    }

    public Integer getCthulhuKnow() {
        return cthulhuKnow;
    }

    public void setCthulhuKnow(Integer cthulhuKnow) {
        this.cthulhuKnow = cthulhuKnow;
    }
}
