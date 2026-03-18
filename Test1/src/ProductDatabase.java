import java.util.ArrayList;
import java.util.List;

class ProductDatabase {
    private static ProductDatabase instance;
    private List<Product> productList;
    public ProductDatabase(){
        productList=new ArrayList<>();
    }
    public static ProductDatabase getInstance(){
        if(instance == null){
            instance = new ProductDatabase();
        }
        return instance;
    }
    public void addProduct(Product p ){
        productList.add(p);
    }
    public void deleteProduct(String id){
        productList.removeIf(p->p.getId().equals(id));
    }
    public Product findById(String id){
        for(Product p:productList){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    public List<Product> getAllProduct(){
        return productList;
    }
}

