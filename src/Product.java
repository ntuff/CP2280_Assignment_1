public class Product {

    private Double id;
    private String description;
    private Double price;

    public Product(Double id, String description, Double price){
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public void setId(Double id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        if (price >= 0){
            this.price = price;
        }
    }

    public Double getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }
}
