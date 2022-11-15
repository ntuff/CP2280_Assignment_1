package Assignment1;

/**
 * @author 20148596
 */


public class AccountTest {

    public static void main(String[] args) {
        System.out.println("Assignment1.Account Class Tester");

        //Test 1: create an account and echo details
        Account account = new Account("Noah Tuff", 0.0);
        printAccountInfo(account);

        //Test 2: Deposit and check the balance
        System.out.println("\n\n Deposit 10 dollars... ");
        account.credit(10.0);
        printAccountInfo(account);


        //Test 3:
        System.out.println("\n\n Withdraw a negative amount... ");
        account.debit(100.0);
        printAccountInfo(account);

        //Test 4: Deposit a negative amount check the balance
        System.out.println("\n\n Deposit -10 dollars... ");
        account.credit(-10.0);
        printAccountInfo(account);

        //Test 5:
        System.out.println("\n\n Debit amount larger than the amount...");
        account.debit(100.0);
        printAccountInfo(account);

        //Test 6:
        System.out.println("\n\n Withdraw an acceptable amount... ");
        account.debit(5.0);
        printAccountInfo(account);

        //Test 6:
        System.out.println("\n\n Reset account balance to zero... ");
        account.reset();
        printAccountInfo(account);
    }

    public static void printAccountInfo(Account account){
        System.out.printf("Assignment1.Account name: %s\nBalance: $%.2f", account.getName(), account.getBalance());
    }
}
