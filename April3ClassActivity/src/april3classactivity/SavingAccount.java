package april3classactivity;
public class SavingAccount extends Account{

    public SavingAccount() {
        setAnnualInterestRate(1.5);
    }

    public void deposit(double amount) {
        if (getBalance()==100000)
            System.out.println("Deposit not allowed");
        else
            setBalance(getBalance()+amount);
    }
    
    
}
