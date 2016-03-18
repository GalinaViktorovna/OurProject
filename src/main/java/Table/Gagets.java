package Table;

import org.hibernate.annotations.Entity;

import javax.persistence.*;

/**
 * Created by Галка on 18.03.2016.
 */
@Entity
@Table(name = "Gagets")
public class Gagets {
    @Id
    @Column(name = "iMei")
    private String iMei;

    @Column(name = "model")
    private String model;

    @Column(name = "problems")
    private String problems;

    @Column(name = "anotherData")
    private String anotherData;

    public String getiMei() {
        return iMei;
    }

    public void setiMei(String iMei) {
        this.iMei = iMei;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }

    public String getAnotherData() {
        return anotherData;
    }

    public void setAnotherData(String anotherData) {
        this.anotherData = anotherData;
    }
}
