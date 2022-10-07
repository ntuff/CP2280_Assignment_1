/**
 * @author 20148596
 */

public class Invoice {

    public LineItem lineItem;
    private int line;

    public Invoice(LineItem lineItem, int line){

        this.lineItem = lineItem;

        LineItem lineItem1 = new LineItem(new Product(
                1, "desc1", 11.11),0);

        LineItem lineItem2 = new LineItem(new Product(
                2, "desc2", 22.22),0);

        LineItem lineItem3 = new LineItem(new Product(
                3, "desc3", 33.33),0);
    }

    public void setLineItem(int line, LineItem lineItem){
        this.lineItem = lineItem;
    }

    public void setLine(int line, LineItem lineItem){
        this.line = line;
    }

    public void getLineItem(int line, LineItem lineItem){

    }

}
