package restrospace.restrospace.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="Users")
public class User {

    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="User_id")
    private int userid;



    @Column(name="User_zipcode")
    private  String userzipcode;

    public User() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserzipcode() {
        return userzipcode;
    }

    public void setUserzipcode(String userzipcode) {
        this.userzipcode = userzipcode;
    }
}
