public class Shop {
    Product[] products = new Product[15];

public void storePdt() {
    products[0] = new Product(1, "Laptop", "Electronics");
    products[1] = new Product(2, "Smartphone", "Electronics");
    products[2] = new Product(3, "Tablet", "Electronics");
    products[3] = new Product(4, "T-shirt", "Fashion");
    products[4] = new Product(5, "Jeans", "Fashion");
    products[5] = new Product(6, "Sneakers", "Fashion");
    products[6] = new Product(7, "Blender", "HomeAppliance");
    products[7] = new Product(8, "Microwave", "HomeAppliance");
    products[8] = new Product(9, "Refrigerator", "HomeAppliance");

    products[9] = new Product(10, "Notebook", "Stationery");
    products[10] = new Product(11, "Pen", "Stationery");
    products[11] = new Product(12, "Stapler", "Stationery");

    products[12] = new Product(13, "Chair", "Furniture");
    products[13] = new Product(14, "Table", "Furniture");
    products[14] = new Product(15, "Bookshelf", "Furniture");
}

       public int linearSearch(int productId){
        for (int i = 0; i < products.length; i++) {
            if(products[i].getProductId() == productId){
                return i;
            }
        }
        return -1;
    }
       
        public int binarySearch(int productId){
        int low = 0;
        int high = products.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(products[mid].getProductId()==productId){
                return mid;
            }else if(products[mid].getProductId()>productId){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    public void result(int productId){
        if(productId==-1)System.out.println("Product is unaviable right now");
        System.out.println("Product : "+ products[productId].getProductName());
    }

    
}
