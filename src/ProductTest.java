/**
 * @author 20148596
 */

public class ProductTest {

    public static void main(String[] args) {
        System.out.println("Product Class Tester\n");

        // Test 1: Create new products
        Product product1 = new Product(
                1,
                "This is a placeholder description.",
                11.11);

        Product product2 = new Product(
                2,
                "This is a placeholder description.",
                22.22);

        Product product3 = new Product(
                3,
                "This is a placeholder description.",
                33.33);

        System.out.println("-- Test 1 --");
        printProductInfo(product1);
        printProductInfo(product2);
        printProductInfo(product3);

        // Test 2: Set product id
        product2.setId(4);
        System.out.println("-- Test 2 --");
        printProductInfo(product2);

        // Test 3: Set product id to a negative value
        product3.setId(-666);
        System.out.println("-- Test 3 --");
        printProductInfo(product3);

        // Test 4: Set product description
        product1.setDescription("This is a new description.");
        System.out.println("-- Test 4 --");
        printProductInfo(product1);

        // Test 5: Set price
        product2.setPrice(44.44);
        System.out.println("-- Test 5 --");
        printProductInfo(product2);

        // Test 6: Set price to a negative value
        product3.setPrice(-666.666);
        System.out.println("-- Test 6 --");
        printProductInfo(product3);

    }

    public static void printProductInfo(Product product){
        System.out.printf("Product ID: %d\nDescription: %s\nPrice: $%.2f\n\n", product.getId(), product.getDescription(), product.getPrice());
    }
}
