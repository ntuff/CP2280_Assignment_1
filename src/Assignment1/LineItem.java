package Assignment1;

/**
 * Contains a LineItem class that is used in conjunction with products and invoices. A lineItem represents a singular       <p>
 * line on an invoice and contains a specific product and the quantity of said product.                                     <p>
 * Note: This class an auxiliary component of Assignment1.Invoice class. It also utilizes the Assignment1.Product class.    <p>
 * @author 20148596                                                                                                         <p>
 * <pre>
 */
public class LineItem{

    private int quantity;
    public Product product;

    /**
     * Creates a line item
     * @param product product created in Product class
     * @param quantity An integer used to measure the amount of the product
     */
    public LineItem(Product product, int quantity){
        this.product = product;
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    /**
     * Sets product
     * @param product product created in Product class
     */
    public void setProduct(Product product){
        this.product = product;
    }

    /**
     * Gets product
     * @return product
     */
    public Product getProduct(){
        return product;
    }

    /**
     * Set quantity
     * @param quantity An integer used to measure the amount of the product
     */
    public void setQuantity(int quantity){
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    /**
     * Get quantity
     * @return quantity
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     * Get total
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
