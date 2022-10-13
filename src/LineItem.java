/**
 * Contains LineItem class.
 * This class an auxiliary component of Invoice class. It also utilizes the Product class.
 * @author 20148596
 */
public class LineItem{
    private int quantity;
    public Product product;

    /**
     * Creates a line item.
     * @param product product created in Product class.
     * @param quantity An integer used to measure the amount of the product.
     */
    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }


    /**
     * Replaces the current product value with a new product.
     * @param product product created in Product class.
     */
    public void setProduct(Product product){
        this.product = product;
    }

    /**
     * Returns the current product.
     * @return product
     */
    public Product getProduct(){
        return product;
    }

    /**
     * Replaces the current quantity value with a new quantity.
     * @param quantity An integer used to measure the amount of the product.
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    /**
     * Returns the current quantity.
     * @return quantity
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     * Returns the cumulative total of the product.
     * @return total
     */
    public double getTotal(){
        if(quantity > 0) {
            double total = product.getPrice() * this.quantity;
            product.setPrice(total);
            return total;
        }
        return 0;
    }
}
