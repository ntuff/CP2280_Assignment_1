import java.util.Scanner;

/**
 * @author 20148596
 */

public class AccountApplication {


    public static void main(String[] args) {
        Account account = new Account("Noah Tuff", 0.0);

        System.out.println("Account Application");

        Scanner input = new Scanner(System.in);
        char c; //Char to drive menu choice

        do{

            printMenu();
            //Grab the user input
            c = Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\nEcho: %c", c);

            if(c=='A'){
                System.out.printf("\nIn Option %c\n", c);
                System.out.println("Enter deposit amount:");

                int depositAmount = input.nextInt();
                account.credit(depositAmount);

                printAccountInfo(account);

            } else  if(c=='B'){
                System.out.printf("\nIn Option %c\n", c);
                System.out.println("Enter deposit amount:");

                int withdrawalAmount = input.nextInt();
                account.debit(withdrawalAmount);

                printAccountInfo(account);

            } else if (c=='C'){
                System.out.printf("\nIn Option %c", c);
                account.reset();
                
                printAccountInfo(account);
            }

        }while(c!='Q');

        System.out.println("\nGOODBYE!");
    }

    public static void printMenu(){
        System.out.println("\n\nPlease select an option:");
        System.out.println("(A) Deposit funds");
        System.out.println("(B) Withdraw funds");
        System.out.println("(C) Reset balance");
        System.out.println("(Q) Quit");
    }

    public static void printAccountInfo(Account account){
        System.out.printf("Account name: %s\nBalance: $%.2f", account.getName(), account.getBalance());
    }

}
