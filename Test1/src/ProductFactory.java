import java.util.Scanner;

public class ProductFactory {
    public static Product createProduct(int type, Scanner sc){
        System.out.println("Nhập ID");
        String id = sc.nextLine();

        System.out.println("Nhập tên");
        String name = sc.nextLine();

        System.out.println("Nhập giá");
        double price = Double.parseDouble(sc.nextLine());

        if(type == 1){
            System.out.println("Nhập trọng lượng");
            double weight = Double.parseDouble(sc.nextLine());
            return new PhysicalProduct(id,name,price,weight);
        }else{
            System.out.println("Nhập dung lượng");
            double size =  Double.parseDouble(sc.nextLine());
            return  new DigitalProduct(id,name,price,size);
        }
    }
}
