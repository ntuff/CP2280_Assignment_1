/**
 * @author 20148596
 */

public class LineItem{

    private int quantity;
    public Product product;


    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public Product getProduct(){
        return product;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }



    public double getTotal(){
        if(quantity > 0) {
            double total = product.getPrice() * this.quantity;
            product.setPrice(total);
            return total;
        }
        return 0;
    }
}
