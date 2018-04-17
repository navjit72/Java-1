package ass7.q1.p1.navjitkaur;

import java.util.Date;

public class Employee extends Person{
    private String officeId;
    private double salary;
    private Date dateHired;
    
    public Employee() {
    }   
    public Employee(String name, String address, long phoneNumber, 
            String email,String officeId, double salary, Date dateHired) {
        super(name,address,phoneNumber,email);
        this.officeId = officeId;
        this.salary = salary;
        this.dateHired = dateHired;
    }   
    public String getOfficeId() {
        return officeId;
    }  
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }   
    public double getSalary() {
        return salary;
    }   
    public void setSalary(double salary) {
        this.salary = salary;
    }   
    public Date getDateHired() {
        return dateHired;
    }   
    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }  
    public String toString() {
        return "Employee";
    }
    
}
