package tuanz.model.pc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Created by Yxm on 2017/7/31.
 */
@Entity
public class PCMagic {
    @Id
    @GeneratedValue
    private Integer Id;

    private Integer PCId;

    private String listMagic;

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

    public String getListMagic() {
        return listMagic;
    }

    public void setListMagic(String listMagic) {
        this.listMagic = listMagic;
    }
}
