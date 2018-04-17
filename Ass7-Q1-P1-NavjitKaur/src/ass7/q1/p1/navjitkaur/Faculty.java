package ass7.q1.p1.navjitkaur;

import java.util.Date;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty() {
    }
    public Faculty(String name, String address, long phoneNumber,
            String email, String officeId, double salary, 
            Date dateHired,String officeHours, String rank) {
        super(name,address,phoneNumber,email,officeId,salary,dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String getOfficeHours() {
        return officeHours;
    }
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String toString() {
        return "Faculty";
    }
}
