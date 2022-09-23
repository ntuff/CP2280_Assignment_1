import java.util.Scanner;

/**
 * @author 20148596
 */


public class AccountTest {

    public static void main(String[] args) {
        System.out.println("Account Class Tester");

        //Test 1: create an account and echo details
        Account account = new Account("Noah Tuff", 0.0);
        printAccountInfo(account);

        //Test 2: Deposit and check the balance
        System.out.println("\n\n Deposit 10 dollars... ");
        account.deposit(10.0);
        printAccountInfo(account);


        //Test 3:
        System.out.println("\n\n Deposit a negative amount... ");
        account.debit(100.0);
        printAccountInfo(account);

        //Test 4:
        //System.out.println("\n\n ");
        //account.debit(10.0);
        //printAccountInfo(account);

        //Test 5:
        System.out.println("\n\n Debit amount larger than the amount...");
        account.debit(100.0);
        printAccountInfo(account);
    }

    public static void printAccountInfo(Account account){
        System.out.printf("Account name: %s\nBalance: $%.2f", account.getName(), account.getBalance());
    }
}
