package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng: Dựa trên mối quan hệ cha con

        // Abstract class
        // Class cha không thể triển khai được mà phải nhờ đến class con
        // Trừu tượng không hoàn toàn (<100%)
        Circle circle = new Circle(1.0);
        System.out.println("circle.area() = " + circle.area());

        // Abstract class không thể khởi tạo đối tượng
        // Shape shape = new Shape();

        // Interface
        // Trừu tượng hoàn toàn (100 %)
        // Mặc định: public abstract
        // Đa kế thừa
        circle.draw();
        circle.extend();

        //dùng khi biết có phương thức nhưng không biết triển khai như thế nào
    }
}
