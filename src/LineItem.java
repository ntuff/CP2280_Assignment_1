/**
 * @author 20148596
 */

public class LineItem{
    private int quantity;
    public Product product;

    /**
     *
     * @param product
     * @param quantity
     */
    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    /**
     *
     * @param product
     */
    public void setProduct(Product product){
        this.product = product;
    }

    /**
     *
     * @return
     */
    public Product getProduct(){
        return product;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     *
     * @return
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
