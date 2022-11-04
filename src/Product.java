/**
 * Contains Product class. A product must have the following:                       <p>
 * - product id                                                                     <p>
 * - description                                                                    <p>
 * - price                                                                          <p>
 *                                                                                  <p>
 * Note: This class an auxiliary component of LineItem and Invoice classes.         <p>
 * @author 20148596                                                                 <p>
 *<pre>
 */
public class Product {

    private int id;
    public String description;
    public double price;

    /**
     * Creates a product.
     * @param id An integer used to identify the product. Value must be >= 0
     * @param description A character string used to describe the product
     * @param price A double representing the dollar value of the product
     */
    public Product(int id, String description, double price){
        this.id = id;
        this.description = description;
        if (price >= 0){
            this.price = price;
        }
    }

    /**
     * Set product id
     * @param id An integer used to identify the product
     */
    public void setId(int id){
        if (id >= 0) {
            this.id = id;
        }
    }

    /**
     * Get product id
     * @return id
     */
    public int getId(){
        return id;
    }

    /**
     * Set product description
     * @param description A character string used to describe the product
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Get product description
     * @return description
     */
    public String getDescription(){
        return description;
    }

    /**
     * Set product price
     * @param price A double representing the dollar value of the product
     */
    public void setPrice(double price){
        if (price >= 0){
            this.price = price;
        }
    }

    /**
     * Get product price
     * @return price
     */
    public double getPrice(){
        return price;
    }
}
