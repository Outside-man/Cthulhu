package tuanz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Yxm on 2017/7/30.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer Id;

    private String Username;

    private String Password;

    public User(){

    }

    public User(String username, String password) {
        Username = username;
        Password = password;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
