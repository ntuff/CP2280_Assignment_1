package Assignment1;

/**
 * @author 20148596
 */

public class LineItemTest {
    public ProductTest productTest;
    public Product product;
    public LineItem lineItem;
    public Invoice invoice;


    public static void main(String[] args) {
        Product product1 = new Product(1, "This is a placeholder description.", 11.11);
        LineItem lineItem1 = new LineItem(product1, 1);

        Product product2 = new Product(2, "This is a placeholder description.", 22.22);
        LineItem lineItem2 = new LineItem(product2, 2);

        Product product3 = new Product(3, "This is a placeholder description.", 33.33);
        LineItem lineItem3 = new LineItem(product3, 3);

        printLineItemInfo(lineItem1);
        printLineItemInfo(lineItem2);
        printLineItemInfo(lineItem3);
    }

    public static void printLineItemInfo(LineItem lineItem){
        System.out.printf("Assignment1.Product: %s\n Quantity: %d\n Total: $%.2f\n\n", lineItem.getProduct(), lineItem.getQuantity(), lineItem.getTotal());

//        System.out.printf("Assignment1.Product ID: %d\nDescription: %s\nPrice: $%.2f\n Quantity: %d", lineItem.getProduct(),
//                lineItem.getQuantity());
    }
}
