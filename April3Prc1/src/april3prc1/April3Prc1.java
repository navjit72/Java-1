package april3prc1;

import java.util.Calendar;

public class April3Prc1 {
    public static void main(String[] args) {
        Customer c= new Customer("Navjit", "Lamp Crescent", 35325213576f, "Yes", 1001);
        System.out.println(c.getName());
        c.setPhone(98799088f);
        System.out.println(c.getPhone());
        System.out.println("---------------------------------------");
        Calendar d=Calendar.getInstance();
        d.set(2001, 7, 12);
        Employee e= new Employee("Navjit", "Cabinet Crescent", 35321534435f, 1011, 5000000, d.getTime());
        System.out.println("Name: "+e.getName()+ " HireDate: "+e.getHireDate());
    }
    
}
