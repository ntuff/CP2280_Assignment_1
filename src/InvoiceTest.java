public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice();

        Product product1 = new Product(
                1,
                "This is a placeholder description.",
                11.11);
        LineItem lineItem1 = new LineItem(product1, 1);

        Product product2 = new Product(
                2,
                "This is a placeholder description.",
                22.22);
        LineItem lineItem2 = new LineItem(product2, 2);


        Product product3 = new Product(
                3,
                "This is a placeholder description.",
                33.33);
        LineItem lineItem3 = new LineItem(product3, 3);


        printInvoice(invoice);

    }

    public static void printInvoice(Invoice invoice) {
        LineItemTest.printLineItemInfo(invoice.getLineItem(1));
        LineItemTest.printLineItemInfo(invoice.getLineItem(1));
        LineItemTest.printLineItemInfo(invoice.getLineItem(1));

        System.out.printf("Total: %f", invoice.getInvoiceTotal());
    }
}

