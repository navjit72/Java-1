package april3classactivity;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

public class April3ClassActivity {
    public static void main(String[] args) {
        ChequingAccount ca=new ChequingAccount();
        System.out.println(ca.getAnnualInterestRate());
        SavingAccount sa=new SavingAccount();
        System.out.println(sa.getAnnualInterestRate());
        sa.setBalance(97500);
        System.out.println(sa.getBalance());
        sa.deposit(2500);
        System.out.println(sa.getBalance());
        sa.deposit(1000);
        System.out.println(sa.getBalance());
        ca.setBalance(20000);
        ca.deposit(1000);
        System.out.println(ca.getBalance());
        ca.deposit(6000);
        System.out.println(ca.getBalance());
    }
    
}
