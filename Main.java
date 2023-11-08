import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Jue", 900);
        System.out.println(bank1.GetBalance());
        System.out.println(bank1.GetBankBalance());
        Bank bank2 = new Bank("Dexter", 500);
        System.out.println(bank2.GetBalance());
        System.out.println(bank2.GetBankBalance());
        Bank bank3 = new Bank("Cici", 1000);
        System.out.println(bank3.GetBalance());
        System.out.println(bank3.GetBankBalance());


        System.out.println(bank1.GetBankBalance());
        // System.out.println(bank1.AuthorizedUser);
        // System.out.println(bank1.GetBalance());
        // System.out.println(bank1.AccountType);
        // bank1.Deposit(500);
        // bank1.Deposit(50);
        // bank1.Deposit(10);
        // double currentBalance = bank1.GetBalance();
        // System.out.println(currentBalance);
        // bank1.Withdrawal(5);
        // currentBalance = bank1.GetBalance();
        // System.out.println(currentBalance);
        // bank1.Balance = 1000000000;
    }
}
