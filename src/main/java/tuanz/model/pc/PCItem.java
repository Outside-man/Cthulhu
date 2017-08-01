package tuanz.model.pc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Created by Yxm on 2017/7/31.
 */
@Entity
public class PCItem {
    @Id
    @GeneratedValue
    private Integer Id;

    private Integer PCId;

    private String listItem;

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

    public String getListItem() {
        return listItem;
    }

    public void setListItem(String listItem) {
        this.listItem = listItem;
    }
}
