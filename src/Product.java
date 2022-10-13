/**
 * @author 20148596
 * Contains Product class.
 * This class an auxiliary component of both LineItem and Invoice classes.
 */

//*TODO: format getters and setters
public class Product {

    private int id;
    public String description;
    public double price;

    /**
     * Creates a product
     * @param id An integer used to identify the product. Value must be >= 0.
     * @param description A character string used to describe the product.
     * @param price A double representing the dollar value of the product.
     */
    public Product(int id, String description, double price){
        this.id = id;
        this.description = description;
        this.price = price;
    }

    /**
     * Replaces the current id with a new id. This value must be an integer.
     * @param id An integer used to identify the product. Value must be >= 0.
     */
    public void setId(int id){
        if (id >= 0) {
            this.id = id;
        }
    }

    /**
     * Replaces the current description with a new description. This value must be a string.
     * @param description A character string used to describe the product.
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Replaces the current price with a new price. This value must be a double.
     * @param price A double representing the dollar value of the product.
     */
    public void setPrice(double price){
        if (price >= 0){
            this.price = price;
        }
    }

    /**
     * returns the current id as an integer.
     * @return id
     */
    public int getId(){
        return id;
    }

    /**
     * Returns the current description as a string.
     * @return description
     */
    public String getDescription(){
        return description;
    }

    /**
     * returns the current price as a double.
     * @return price
     */
    public double getPrice(){
        return price;
    }
}
