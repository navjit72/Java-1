package april3classactivity;
public class ChequingAccount extends Account{

    public ChequingAccount() {
        setAnnualInterestRate(0.05);
    }
       
    public void deposit(double amount){
        if(amount<=5000)
            setBalance(getBalance()+amount);
        else
            System.out.println("Amount more than $5000.");
    }
}
