public class OutputDemo {
    public static void main(String[] args) {
        System.out.println("Java core");

        //Escape characters
        // \" -> "
        // \' -> '
        // \n -> xuống dòng
        // \t -> Tab

        // System.out.printf
        // %s đại diện cho String
        // %d đại diện cho số nguyên
        // %f đại diện cho số thực
        // %c đại diện cho 1 ký tự
        // %n xuống dòng dành riêng cho printf

        System.out.printf("Họ Tên: %s, tuổi: %d.%n", "Khoa",22);

        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.println("| ID |     FULL NAME      |");
        System.out.println("+----+--------------------+");
        System.out.printf("| %2d | %-18s |%n", 1, "Nguyễn Thành Đạt");
        System.out.println("+----+--------------------+");
        System.out.printf("| %-2d | %-18s |%n", 2, "Nguyễn Văn Long");
        System.out.println("+----+--------------------+");

        // Gom nhóm và làm tròn
        double money= 12345654321.789;
        System.out.printf("money = %.2f%n", money);
        System.out.printf("money = %,f%n", money);
        System.out.printf("money = %,.2f%n", money);
    }
}
