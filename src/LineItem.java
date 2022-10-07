/**
 * @author 20148596
 */

public class LineItem {

    private int quantity;
    public Product product;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void getTotal(double price, int quantity){
        if(quantity > 0){
           double total = product.getPrice() * this.quantity;
           product.setPrice(total);
        }
    }
}
