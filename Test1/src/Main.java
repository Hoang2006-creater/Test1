import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDatabase db = ProductDatabase.getInstance();
        while(true){
            System.out.println("\n------ QUẢN LÝ SẢN PHẨM ------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xem danh sách");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoá");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập loại");
                    int type = Integer.parseInt(sc.nextLine());
                    Product p = ProductFactory.createProduct(type,sc);
                    db.addProduct(p);
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    for (Product pro: db.getAllProduct()){
                        pro.displayInfo();
                    }
                    break;
                case 3:
                    System.out.println("Nhập ID cần sửa: ");
                    String idUpdate = sc.nextLine();
                    Product proUpdate = db.findById(idUpdate);
                    if(proUpdate !=null){
                        System.out.println("Ten moi");
                        proUpdate.setName(sc.nextLine());
                        proUpdate.setPrice(Double.parseDouble(sc.nextLine()));
                        System.out.println("Cap nhat thanh cong");
                    }else {
                        System.out.println("KHong tim thay ");
                    }
                    break;
                case 4:
                    System.out.println("Nhập id cần xóa");
                    String idDelete = sc.nextLine();
                    db.deleteProduct(idDelete);
                    System.out.println("Da xoa");
                    break;
                case 5:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }

    }
}
