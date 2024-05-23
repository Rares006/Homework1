public class Product {
    private String name;
    private Integer price;
    private Integer quantity;
    private String category;

    public Product(String name, Integer price, Integer quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;

    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStcock(){
        if (quantity != 0){
            return true;
        }else return false;
    }

    public boolean isCategory(String category){
     if(getCategory().equals(category)) {
         return true;
     }else return false;
    }
}
