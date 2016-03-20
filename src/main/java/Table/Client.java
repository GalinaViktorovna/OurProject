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

    @Column (name = "lastName")
    private String lastName;

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



    public String getMiddleName() {
        return lastName;
    }

    public void setMiddleName(String middleName) {
        this.lastName = middleName;
    }

    public double getMeans() {
        return means;
    }

    public void setMeans(double means) {
        this.means = means;
    }
}
