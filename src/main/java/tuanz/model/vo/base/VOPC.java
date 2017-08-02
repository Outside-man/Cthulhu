package tuanz.model.vo.base;

import tuanz.model.pc.*;

/**
 * Created by Yxm on 2017/8/3.
 */
public class VOPC {
    private PC pc;
    private PCBase base;
    private PCInfo info;
    private PCAttr attr;
    private PCSkill skill;
    private PCItem item;
    private PCMagic magic;

    public PC getPc() {
        return pc;
    }

    public void setPc(PC pc) {
        this.pc = pc;
    }

    public PCBase getBase() {
        return base;
    }

    public void setBase(PCBase base) {
        this.base = base;
    }

    public PCInfo getInfo() {
        return info;
    }

    public void setInfo(PCInfo info) {
        this.info = info;
    }

    public PCAttr getAttr() {
        return attr;
    }

    public void setAttr(PCAttr attr) {
        this.attr = attr;
    }

    public PCSkill getSkill() {
        return skill;
    }

    public void setSkill(PCSkill skill) {
        this.skill = skill;
    }

    public PCItem getItem() {
        return item;
    }

    public void setItem(PCItem item) {
        this.item = item;
    }

    public PCMagic getMagic() {
        return magic;
    }

    public void setMagic(PCMagic magic) {
        this.magic = magic;
    }
}
