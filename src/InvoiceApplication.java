import java.util.Scanner;

public class InvoiceApplication {

    public static void main(String[] args) {

        Product product1 = new Product(1, "This is a placeholder description.", 11.11);
        LineItem lineItem1 = new LineItem(product1, 1);

        Product product2 = new Product(2, "This is a placeholder description.", 22.22);
        LineItem lineItem2 = new LineItem(product2, 2);

        Product product3 = new Product(3, "This is a placeholder description.", 33.33);
        LineItem lineItem3 = new LineItem(product3, 3);

        Invoice invoice = new Invoice(lineItem1, lineItem2, lineItem3);

        System.out.println("Invoice Application");
    } // remove

//        Scanner input = new Scanner(System.in);
//        char c; //Char to drive menu choice
//
//        do{
//
//            printMenu();
//            //Grab the user input
//            c = Character.toUpperCase(input.next().charAt(0));
//
//            System.out.printf("\nEcho: %c", c);
//
//            if(c=='A'){
//                System.out.printf("\nIn Option %c\n", c);
//                System.out.println("Enter deposit amount:");
//
//                int depositAmount = input.nextInt();
//                account.credit(depositAmount);
//
//                printAccountInfo(account);
//
//            } else  if(c=='B'){
//                System.out.printf("\nIn Option %c\n", c);
//                System.out.println("Enter deposit amount:");
//
//                int withdrawalAmount = input.nextInt();
//                account.debit(withdrawalAmount);
//
//                printAccountInfo(account);
//
//            } else if (c=='C'){
//                System.out.printf("\nIn Option %c", c);
//                account.reset();
//
//                printAccountInfo(account);
//            }
//
//        }while(c!='Q');
//
//        System.out.println("\nGOODBYE!");
//    }
//
//    public static void printMenu(){
//        System.out.println("\n\nPlease select an option:");
//        System.out.println("(A) Deposit funds");
//        System.out.println("(B) Withdraw funds");
//        System.out.println("(C) Reset balance");
//        System.out.println("(Q) Quit");
//    }
//
//    public static void printAccountInfo(Account account){
//        System.out.printf("Account name: %s\nBalance: $%.2f", account.getName(), account.getBalance());
//    }
}
