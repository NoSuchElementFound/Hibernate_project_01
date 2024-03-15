package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student", schema = "datahouse")
public class StudentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "SName")
    private String sName;
    @Basic
    @Column(name = "SEmail")
    private String sEmail;
    @Basic
    @Column(name = "SCity")
    private String sCity;
    @Basic
    @Column(name = "SCountry")
    private String sCountry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsCity() {
        return sCity;
    }

    public void setsCity(String sCity) {
        this.sCity = sCity;
    }

    public String getsCountry() {
        return sCountry;
    }

    public void setsCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (id != that.id) return false;
        if (sName != null ? !sName.equals(that.sName) : that.sName != null) return false;
        if (sEmail != null ? !sEmail.equals(that.sEmail) : that.sEmail != null) return false;
        if (sCity != null ? !sCity.equals(that.sCity) : that.sCity != null) return false;
        if (sCountry != null ? !sCountry.equals(that.sCountry) : that.sCountry != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (sEmail != null ? sEmail.hashCode() : 0);
        result = 31 * result + (sCity != null ? sCity.hashCode() : 0);
        result = 31 * result + (sCountry != null ? sCountry.hashCode() : 0);
        return result;
    }
}
