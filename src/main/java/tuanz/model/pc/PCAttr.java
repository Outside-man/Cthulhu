package tuanz.model.pc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Yxm on 2017/7/31.
 */
@Entity
public class PCAttr {
    @Id
    @GeneratedValue
    private Integer Id;

    private Integer PCId;

    private Integer Str;//力量

    private Integer Dex;//敏捷

    private Integer Con;//体质

    private Integer Pow;//意志

    private Integer App;//外貌

    private Integer Intell;//智力

    private Integer Body;//体型

    private Integer Edu;//教育

    private Integer Ins;//灵感

    private Integer Luck;//幸运

    private Integer Know;//知识

    private Integer Money;//财富

    private Integer cthulhuKnow;//克苏鲁知识

    private Integer hpLimit;

    private Integer hpNow;

    private Integer mpLimit;

    private Integer mpNow;

    private Integer sanLimit;

    private Integer sanNow;

    public  PCAttr(){

    }

    public PCAttr(Integer PCId, Integer str, Integer dex, Integer con, Integer pow, Integer app, Integer intell, Integer body, Integer edu, Integer money) {
        this.PCId = PCId;
        this.Str = str;
        this.Dex = dex;
        this.Con = con;
        this.Pow = pow;
        this.App = app;
        this.Intell = intell;
        this.Body = body;
        this.Edu = edu;
        this.Money = money;
        this.Ins = intell*5;
        this.Luck = pow*5;
        this.Know = edu*5;
        this.cthulhuKnow = 0;
        this.hpLimit = (con + body + 1)/2;
        this.hpNow = hpLimit;
        this.mpLimit = pow;
        this.mpNow = mpLimit;
        this.sanLimit = pow*5;
        this.sanNow = sanLimit;
    }

    public void flush(){
        this.cthulhuKnow = 0;
        this.hpLimit = (Con + Body + 1)/2;
        this.hpNow = hpLimit;
        this.mpLimit = Pow;
        this.mpNow = mpLimit;
        this.sanLimit = Pow*5;
        this.sanNow = sanLimit;
    }
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

    public Integer getApp() {
        return App;
    }

    public void setApp(Integer app) {
        App = app;
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
