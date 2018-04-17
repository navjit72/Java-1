package april3prc1;

import java.util.Date;


public class Employee extends Person{
    private int empId;
    private double salary;
    private Date hireDate;
    
    Employee(String name, String addr, float phone, int eId, double sal, Date hDate ) {
        super(name,addr,phone);
        empId=eId;
        salary=sal;
        hireDate=hDate;
    }
    
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    
    
}
