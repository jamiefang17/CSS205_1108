public class Main {
    public static void main(String[] args) {  //static means global set
        Bank bank1 = new Bank(); //new means creating a new instance variable
        bank1.Deposit(500);
        bank1.Deposit(100);
        double currentBalance = bank1.GetBalance();//becuz balance is private,
        System.out.println(currentBalance); 
        bank1.Withdrawl(5);
        double balanceAfterWithdrawl = bank1.GetBalance();
        System.out.println(balanceAfterWithdrawl);
    }
    
}
