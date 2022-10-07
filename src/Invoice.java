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


    public void setLineItem(int line, LineItem lineItem){
        if (line == 1){
            this.lineItem = lineItem;

        } else if (line == 2){
            this.lineItem = lineItem;

        } else if (line == 3){
            this.lineItem = lineItem;
        }
    }


    public void getInvoiceTotal() {
        double invoiceTotal;
        invoiceTotal = lineItem1.product.getPrice() + lineItem2.product.getPrice() + lineItem3.product.getPrice();

        //        invoiceTotal = invoiceTotal + lineItem1.getTotal() + lineItem2.getTotal() + lineItem3.getTotal();
    }
}


