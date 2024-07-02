package encapsulation;

public class EncapssulationDemo {
    public static void main(String[] args) {
        // Tính đóng gói: che dấu thông tin
        // 1. Private các thuộc tính
        // 2. Cung cấp getter / setter
        Cat cat = new Cat("Long", 2);
        cat.setAge(-100);
        System.out.println("cat = " + cat);
        System.out.println("cat.getName() = " + cat.getName());
    }


}
