package ass7.q1.p1.navjitkaur;

import java.util.Date;

public class Staff extends Employee{
    private String title;

    public Staff() {
    }

    public Staff(String name, String address, 
            long phoneNumber, String email, String officeId,
            double salary, Date dateHired,String title) {
        super(name,address,phoneNumber,email,officeId,salary,dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff";
    }    
}