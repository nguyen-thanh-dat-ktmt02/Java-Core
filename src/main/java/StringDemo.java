public class StringDemo {
    public static void main(String[] args) {
        // Nguyên thủy
        String s1 = "Java Core"; // dia chi:1
        String s2 = "Java Core"; // dia chi:1

        // Non primitive
        String s3 = new String("Java core"); // dia chi:2
        String s4 = new String("Java core"); // dia chi:3

        // So sánh == và equels
        System.out.println(s1 == s2); //true
        System.out.println(s2 == s3); //flase
        System.out.println(s3 == s4); //flase

        System.out.println(s1.equals(s2)); //true
        System.out.println(s2.equals(s3)); //true
        System.out.println(s3.equals(s4)); //true

        
    }
}
