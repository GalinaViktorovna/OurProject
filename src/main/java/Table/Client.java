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
    @Column (name = "numberPhone")
    private int phoneNumber;

    @Column (name = "firstName")
    private String firstName;

    @Column (name = "name")
    private String name;

    @Column (name = "middleName")
    private String middleName;

    @Column ( name = "means")
    private double means;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public double getMeans() {
        return means;
    }

    public void setMeans(double means) {
        this.means = means;
    }
}
