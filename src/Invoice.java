/**
 * Contains Invoice class. An invoice must contain line items.                              <p>
 *     In this case, 3 line items are required:                                             <p>
 *         <code>&#64;public Invoice(LineItem lineItem1, LineItem lineItem2, LineItem lineItem3){</code>
 *                                                                                          <p>
 * Note: This class utilizes both LineItem and Product classes.                             <p>
 * @author 20148596                                                                         <p>
 * <pre>
 */
public class Invoice {

    public LineItem lineItem1;
    public LineItem lineItem2;
    public LineItem lineItem3;

    /**
     * Creates an invoice
     * @param lineItem1 line item created in LineItem class
     * @param lineItem2 line item created in LineItem class
     * @param lineItem3 line item created in LineItem class
     */
    public Invoice(LineItem lineItem1, LineItem lineItem2, LineItem lineItem3){
        this.lineItem1 = lineItem1;
        this.lineItem2 = lineItem2;
        this.lineItem3 = lineItem3;
    }

    /**
     * Set line item
     * @param line line number of the line item
     * @param lineItem lineItem created in LineItem class
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
     * Get line item
     * @param line Line number of line item
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
     * Get blank line item
     * @return lineItem a new lineItem that is empty
     */
    private  LineItem getBlankLineItem(){
        return new LineItem(new Product(0, "", 0), 0);
    }

    /**
     * Get invoice total
     * @return cost of combined lineItem1, lineItem2, and lineItem3
     */
    public double getInvoiceTotal() {
        return (lineItem1.product.getPrice() * lineItem1.getQuantity()) + (lineItem2.product.getPrice() * lineItem2.getQuantity()) + (lineItem3.product.getPrice() * lineItem3.getQuantity());
    }
}


