import java.util.Scanner;

public class AccountApplication {


    public static void main(String[] args) {
        System.out.println("Account Application");

        Scanner input = new Scanner(System.in);
        char c; //Char to drive menu choice

        do{
            printMenu();
            //Grab the user input
            c = Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\nEcho: %c", c);

            if(c=='A'){
                System.out.printf("\nIn Option %c", c);
                //TODO do something
                System.out.println("\n\n Deposit 10 dollars... ");
                account.credit(10.0);
                printAccountInfo(account);

            } else  if(c=='B'){
                System.out.printf("\nIn Option %c", c);
                //TODO do something
            } else if (c=='C'){
                System.out.printf("\nIn Option %c", c);
                //TODO do something
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
}
