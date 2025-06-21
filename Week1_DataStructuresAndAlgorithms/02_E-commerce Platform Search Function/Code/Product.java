public class Product{
    int productId;
    String ProductName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.ProductName = productName;
        this.category = category;
    }
    public int getProductId(){
        return productId;
    }
    public String getCategory(){
        return category;
    }
    public String getProductName(){
        return ProductName;
    }

}