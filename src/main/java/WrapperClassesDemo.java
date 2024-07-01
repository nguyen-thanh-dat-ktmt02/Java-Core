public class WrapperClassesDemo {
    public static void main(String[] args) {
        //Primitive             Wrapper class
        //byte                  Byte
        //short                 Short
        //int                   Interger
        //long                  Long
        //float                 Float
        //double                Double
        //char                  Character
        //boolean               Boolean

        // Boxing: Premitive -> Wrapper class
        int a = 100;
        Integer b = Integer.valueOf(a);

        // Unboxing: Wrapper class -> Premetive
        Integer x = Integer.valueOf(100);
        int y = x.intValue();

        // Ứng dụng
        // 1. Kiểm tra ký tự in hoa, in thường
        System.out.println("Character.isDigit() = " + Character.isDigit('1'));
        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));
        System.out.println("Character.isAlphabetic('b') = " + Character.isAlphabetic('b'));

        // 2. Chuyển String sang số
        String s = "123456";
        int n = Integer.parseInt(s);
        System.out.println(s + 10);
        System.out.println(n + 10);
        double m= Double.parseDouble("123.456");
        System.out.println(m+10);
    }
}
