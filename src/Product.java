/**
 * @author 20148596
 */

public class Product {

    private int id;
    public String description;
    public double price;

    /**
     *
     * @param id
     * @param description
     * @param price
     */
    public Product(int id, String description, double price){
        this.id = id;
        this.description = description;
        this.price = price;
    }

    /**
     *
     * @param id
     */
    public void setId(int id){
        if (id >= 0) {
            this.id = id;
        }
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price){
        if (price >= 0){
            this.price = price;
        }
    }

    /**
     *
     * @return
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return
     */
    public String getDescription(){
        return description;
    }

    /**
     *
     * @return
     */
    public double getPrice(){
        return price;
    }
}
