public class LineItemTest {

    public Product product;
    public LineItem lineItem;

    public static void main(String[] args) {

    }

    public static void printLineItemInfo(LineItem lineItem){
        System.out.printf("Product ID: %s\nQuantity: %d\nTotal: $%.2f\n\n", lineItem.getProduct(), lineItem.getQuantity(), lineItem.getTotal(double price, int quantity));
    }
}
