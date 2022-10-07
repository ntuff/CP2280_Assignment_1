/**
 * @author 20148596
 */

public class Invoice {

    public LineItem lineItem;

    public Product product;
    

    LineItem lineItem1 = new LineItem(new Product(
            1, "desc1", 11.11),0);

    LineItem lineItem2 = new LineItem(new Product(
            2, "desc2", 22.22),0);

    LineItem lineItem3 = new LineItem(new Product(
            3, "desc3", 33.33),0);

    public Invoice(LineItem lineItem1, LineItem lineItem2, LineItem lineItem3){


    }

    public void setLineItem(int line, LineItem lineItem){
        this.lineItem = lineItem;
    }

    public void setLine(int line, LineItem lineItem){
        this.line = line;
    }

    public LineItem getLineItem(int line, LineItem lineItem){
        return lineItem;
    }

    public void getTotal(double price, int quantity) {
        if (quantity > 0) {
            double total = product.getPrice() * this.quantity;
            product.setPrice(total);
        }
    }
}
