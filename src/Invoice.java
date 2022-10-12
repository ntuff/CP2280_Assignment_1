/**
 * @author 20148596
 */

public class Invoice {
    private LineItem lineItem1;
    private LineItem lineItem2;
    private LineItem lineItem3;

    /**
     *
     * @param lineItem1
     * @param lineItem2
     * @param lineItem3
     */
    public Invoice(LineItem lineItem1, LineItem lineItem2, LineItem lineItem3){
        this.lineItem1 = lineItem1;
        this.lineItem2 = lineItem2;
        this.lineItem3 = lineItem3;
    }

    /**
     *
     * @param line
     * @return lineItem1 || lineItem2 || lineItem3
     */
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

    /**
     *
     * @param line
     * @param lineItem
     */
    public void setLineItem(int line, LineItem lineItem){
        if (line == 1){
            this.lineItem1 = lineItem;

        } else if (line == 2){
            this.lineItem2 = lineItem;

        } else if (line == 3){
            this.lineItem3 = lineItem;
        }
    }

    /**
     *
     * @return
     */
    private  LineItem getBlankLineItem(){
        return new LineItem(new Product(0, "", 0), 0);
    }

    /**
     *
     * @return
     */
    public double getInvoiceTotal() {
        return lineItem1.product.getPrice() + lineItem2.product.getPrice() + lineItem3.product.getPrice();
    }
}


