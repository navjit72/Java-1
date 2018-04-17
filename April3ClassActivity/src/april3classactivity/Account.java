package april3classactivity;

import java.util.Date;

public class Account {
    private int id=0;
    private double balance=0.0;
    private double annualInterestRate=0.0;
    private Date dateCreated;

    Account(){
        
    }
    
    Account(int id, double bal){
        this.id=id;
        this.balance=bal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12.0;
    }
    
    public void withdraw(double amount){
        balance-=amount;
    }
    
    public void deposit(double amount){
        balance+=amount;
    }
    
}

