/**
 * @author 20148596
 */

public class Invoice {


    private LineItem lineItem1;
    private LineItem lineItem2;
    private LineItem lineItem3;

    //TODO:
//    public LineItem(){
//        this.lineItem1 = getBlankLineItem();
//        this.lineItem2 = getBlankLineItem();
//        this.lineItem3 = getBlankLineItem();
//    }

    public LineItem getLineItem(int line) {
        if (line == 1){
            return lineItem1;

        } else if (line == 2){
            return lineItem2;

        } else if (line == 3){
            return lineItem3;
        } else{
            return lineItem3;
        }
    }

    public void setLineItem(int line, LineItem lineItem){
        if (line == 1){
            this.lineItem1 = lineItem;

        } else if (line == 2){
            this.lineItem2 = lineItem;

        } else if (line == 3){
            this.lineItem3 = lineItem;
        }
    }

    private  LineItem getBlankLineItem(){
        return new LineItem(new Product(0, "", 0), 0);
    }

    public double getInvoiceTotal() {
        return lineItem1.product.getPrice() + lineItem2.product.getPrice() + lineItem3.product.getPrice();
    }
}


