package tuanz.model.pc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Yxm on 2017/7/31.
 */
@Entity
public class PC {
    @Id
    @GeneratedValue
    private Integer Id;

    private Integer userId;

    private Integer status;//0创建未完成 1创建完成 2死亡 3疯狂

    private Integer baseId;//基础

    private Integer attrId;//属性

    private Integer skillId;//技能

    private Integer infoId;//信息

    private Integer itemId;//物品

    private Integer magicId;//魔法

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getMagicId() {
        return magicId;
    }

    public void setMagicId(Integer magicId) {
        this.magicId = magicId;
    }
}
