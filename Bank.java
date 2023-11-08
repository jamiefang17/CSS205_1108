/**
 * Bank
 */

 enum AccountTypeEnum { SAVINGS, CHECKING }

public class Bank {
    // this balance will track the overall balance stored at the bank
    private static double BankBalance;
    private double Balance;
    AccountTypeEnum AccountType;
    String AuthorizedUser;

    public Bank() {
        AccountType = AccountTypeEnum.CHECKING;
        AuthorizedUser= "";
    }

    public Bank(String incAuthorizedUser) {
        AccountType = AccountTypeEnum.CHECKING;
        this.AuthorizedUser = incAuthorizedUser;
    }
    
    public Bank(String incAuthorizedUser, double balance) {
        AccountType = AccountTypeEnum.CHECKING;
        this.AuthorizedUser = incAuthorizedUser;
        BankBalance += balance;
        Balance = balance;
    }

    public double GetBalance(){
        return Balance;
    }

    public double GetBankBalance() {
        return BankBalance;
    }

    public double Deposit(double amount){
        BankBalance += amount;
        return Balance += amount;
    }

    public double Withdrawal(double amount){
        double updatedBalance = Balance - amount;
        double rtnBalance = 0;

        if(updatedBalance >=0){
            Balance -= amount;
            BankBalance -= amount;
            rtnBalance = updatedBalance;
        } else {
            double zeroBalance = 0;
            Balance = zeroBalance;
            BankBalance -= Balance;
            rtnBalance = zeroBalance;
        }

        //System.out.println(zeroBalance);
        return rtnBalance;
    }
}