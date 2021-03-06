package Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Галка on 18.03.2016.
 */
@Entity
@Table(name = "Client")
public class Client {
    @Id
private Long id;



    private long phoneNumber;

    @Column (name = "firstName")
    private String firstName;

    @Column (name = "lastName")
    private String lastName;

    @Column ( name = "means")
    private double means;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String middleName) {
        this.lastName = middleName;
    }

    public double getMeans() {
        return means;
    }

    public void setMeans(double means) {
        this.means = means;
    }
}
