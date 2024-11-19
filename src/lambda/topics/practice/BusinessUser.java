package lambda.topics.practice;


import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

public class BusinessUser {

    private int id;
    private String name;
    private String region;
    private BigInteger salary;

    private LocalDate joiningDate;

    public BusinessUser(int id, String name, String region, BigInteger salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessUser that = (BusinessUser) o;

        if (id != that.id) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(region, that.region)) return false;
        if (!Objects.equals(salary, that.salary)) return false;
        return Objects.equals(joiningDate, that.joiningDate);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (joiningDate != null ? joiningDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BusinessUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", salary=" + salary +
                ", joiningDate=" + joiningDate +
                '}';
    }
}

