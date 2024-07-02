import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Hàm khởi tạo
        // 1. Tên constructor trùng với tên của class
        // 2. Constructoe không có kiểu dữ liệu trả về
        Dog dog = new Dog("Long",2);
        System.out.println("dog = " + dog);

        Dog dog1 = new Dog("Linh");
        System.out.println("dog1 = " + dog1);

        // Mac dinh: 0 tham số
        Dog dog2 = new Dog();
        System.out.println("dog2 = " + dog2);


    }
}
