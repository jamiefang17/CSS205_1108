/**
 * Bank
 */

 enum AccountType {SAVINGS, CHECKING}
public class Bank {
    private double Balance;

    public double GetBalance(){
        return Balance;  
}

    public double Deposit(double amount){
        Balance += amount;
        return Balance;
    }

    public double Withdrawl(double amount){
        Balance -= amount;
        return Balance;

    }
}