public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java core";
        String search = "   Samsung   ";
        System.out.println("s.length() = " + s.length()); // kiem tra do dai
        System.out.println("s.isEmpty() = " + s.isEmpty()); // kiem tra rỗng
        System.out.println("s.charAt(0) = " + s.charAt(0)); // Lấy ra ký tự trong chuỗi
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));// lay ra thu tu trong chuoi
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));
        System.out.println("search.trim() = " + search.trim());// loai bo khoang trang du thua
        System.out.println("s.concat(search) = " + s.concat(search));// ham noi chuoi + string
        System.out.println("s.replaceAll(\"a\", \"o\") = " + s.replaceAll("a", "o"));// thay đổi ký tự
        System.out.println("s.substring(0, 4) = " + s.substring(0, 4));// Lấy chỉ số trong chuỗi
        System.out.println("s.substring(5) = " + s.substring(5));// Lấy chỉ số đến hết chuỗi
        System.out.println("s.toUpperCase() = " + s.toUpperCase());// Tất cả viết hoa
        System.out.println("s.toLowerCase() = " + s.toLowerCase());// Tất cả viết thường
        String[] words = s.split(" ");// Hàm tach chuỗi
        for (String word: words){
            System.out.println("word = " + word);
        }


    }
}
