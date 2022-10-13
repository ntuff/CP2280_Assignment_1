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

        Scanner input = new Scanner(System.in);
        char c; //Char to drive menu choice
        char c2; //Char to drive sub menu choice
        do {

            printMenu();
            //Grab the user input
            c = Character.toUpperCase(input.next().charAt(0));

            if (c == 'A') {
                System.out.printf("\nOption %c\n------------", c);
                System.out.println("Please select an option:");
                do {

                    printSubMenu();
                    c2 = Character.toUpperCase(input.next().charAt(0));

                    if (c2 == 'A') {
                        System.out.println("Enter new product ID:");
                        product1.setId(input.nextInt());

                    } else if (c2 == 'B') {
                        System.out.println("Enter new product description:");
                        product1.setDescription(input.next());

                    } else if (c2 == 'C') {
                        System.out.println("Enter new product price:");
                        product1.setPrice(input.nextDouble());

                    } else if (c2 == 'D') {
                        printProductInfo(product1);

                    } else if (c2 == 'E') {
                        printLineItemInfo(lineItem1);
                    }

                }while (c2 != 'R');

                invoice.getInvoiceTotal();

            } else if (c == 'B') {
                System.out.printf("\nIn Option %c\n", c);
                System.out.println("Enter tbdvalue:");

                //int withdrawalAmount = input.nextInt();
                //account.debit(withdrawalAmount);

                //printAccountInfo(account);

            } else if (c == 'C') {
                System.out.printf("\nIn Option %c", c);
                //account.reset();

                //printAccountInfo(account);

            } else if (c == 'D') {
                System.out.printf("\nIn Option %c", c);
                //account.reset();
            }
        }while (c != 'Q');

            System.out.println("\nGOODBYE!");
    }
    public static void printMenu () {
        System.out.println("\n\nPlease select an option:");
        System.out.println("(A) First Line Item");
        System.out.println("(B) Second Line Item");
        System.out.println("(C) Third Line Item");
        System.out.println("(Q) Quit");
    }

    public static void printSubMenu () {
        System.out.println("\n\nPlease select an option:");
        System.out.println("(A) Change product ID");
        System.out.println("(B) Change product description");
        System.out.println("(C) Change product price");
        System.out.println("(D) View product details");
        System.out.println("(E) View line item");
        System.out.println("(R) Return");
    }

    public static void printLineItemInfo (LineItem lineItem){
        System.out.printf("Product: %s\n Quantity: %d\n Total: $%.2f\n\n", lineItem.getProduct(), lineItem.getQuantity(), lineItem.getTotal());
    }

    public static void printProductInfo(Product product){
        System.out.printf("Product ID: %d\nDescription: %s\nPrice: $%.2f\n\n", product.getId(), product.getDescription(), product.getPrice());
    }
}
