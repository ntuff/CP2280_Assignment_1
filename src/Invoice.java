public class Invoice {

    public LineItem lineItem;

    public Invoice(LineItem lineItem){
        LineItem lineItem1 = new LineItem(new Product(
                1.0, "desc1", 11.11),0);

    }
}
