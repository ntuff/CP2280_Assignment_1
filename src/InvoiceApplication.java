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
                System.out.printf("\nOption %c\n------------\n", c);
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
                        System.out.println("Enter new line item quantity:");
                        lineItem1.setQuantity(input.nextInt());

                    } else if (c2 == 'E') {
                        printProductInfo(product1);

                    } else if (c2 == 'F') {
                        printLineItemInfo(lineItem1);

                    }

                }while (c2 != 'R');

            } else if (c == 'B') {
                System.out.printf("\nOption %c\n------------\n", c);
                System.out.println("Please select an option:");
                do {

                    printSubMenu();
                    c2 = Character.toUpperCase(input.next().charAt(0));

                    if (c2 == 'A') {
                        System.out.println("Enter new product ID:");
                        product2.setId(input.nextInt());

                    } else if (c2 == 'B') {
                        System.out.println("Enter new product description:");
                        product2.setDescription(input.next());

                    } else if (c2 == 'C') {
                        System.out.println("Enter new product price:");
                        product2.setPrice(input.nextDouble());

                    } else if (c2 == 'D') {
                        System.out.println("Enter new line item quantity:");
                        lineItem2.setQuantity(input.nextInt());

                    } else if (c2 == 'E') {
                        printProductInfo(product2);

                    } else if (c2 == 'F') {
                        printLineItemInfo(lineItem2);

                    }

                }while (c2 != 'R');

            } else if (c == 'C') {
                System.out.printf("\nOption %c\n------------\n", c);
                System.out.println("Please select an option:");
                do {

                    printSubMenu();
                    c2 = Character.toUpperCase(input.next().charAt(0));

                    if (c2 == 'A') {
                        System.out.println("Enter new product ID:");
                        product3.setId(input.nextInt());

                    } else if (c2 == 'B') {
                        System.out.println("Enter new product description:");
                        product3.setDescription(input.next());

                    } else if (c2 == 'C') {
                        System.out.println("Enter new product price:");
                        product3.setPrice(input.nextDouble());

                    } else if (c2 == 'D') {
                        System.out.println("Enter new line item quantity:");
                        lineItem3.setQuantity(input.nextInt());

                    } else if (c2 == 'E') {
                        printProductInfo(product3);

                    } else if (c2 == 'F') {
                        printLineItemInfo(lineItem3);

                    }

                }while (c2 != 'R');

            } else if (c == 'D') {
                System.out.printf("\nOption %c\n------------\nInvoice:\n\n", c);
                printLineItemInfo(lineItem1);
                printLineItemInfo(lineItem2);
                printLineItemInfo(lineItem3);
                printInvoice(invoice);
                System.out.print("------------\n");
            }
        }while (c != 'Q');

            System.out.println("\nGOODBYE!");
    }
    public static void printMenu () {
        System.out.println("\n\nPlease select an option:");
        System.out.println("(A) First Line Item");
        System.out.println("(B) Second Line Item");
        System.out.println("(C) Third Line Item");
        System.out.println("(D) View Invoice");
        System.out.println("(Q) Quit");
    }

    public static void printSubMenu () {
        System.out.println("\n\nPlease select an option:");
        System.out.println("(A) Edit product ID");
        System.out.println("(B) Edit product description");
        System.out.println("(C) Edit product price");
        System.out.println("(D) Edit line item quantity");
        System.out.println("(E) View product details");
        System.out.println("(F) View line item");
        System.out.println("(R) Return");
    }

    public static void printLineItemInfo (LineItem lineItem){
        System.out.printf("Product: %s\nQuantity: %d\nTotal: $%.2f\n\n", lineItem.getProduct(), lineItem.getQuantity(), lineItem.getTotal());
    }

    public static void printProductInfo(Product product){
        System.out.printf("Product ID: %d\nDescription: %s\nPrice: $%.2f\n\n", product.getId(), product.getDescription(), product.getPrice());
    }

    public static void printInvoice(Invoice invoice) {
        System.out.printf("Invoice Total: %.2f\n", invoice.getInvoiceTotal());
    }
}
