import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // Phạm vi truy cập
        // public: Có the truy cập được từ mọi nơi
        Dog dog1= new Dog("Long", 2);
        System.out.println("dog1.name = " + dog1.name);

        // protected: Trong cùng package hoặc class con
        // Dog dog2= new Dog("Long", 2);

        // default: Tròng cùng package
        Dog dog3= new Dog("Long", 2);
        // System.out.println("dog3.color = " + dog3.color);

        // private: Chỉ có thể truy cập trong cùng class
        Dog dog4= new Dog("Long", 2);
        // System.out.println("dog4.id = " + dog4.id);


    }
}
