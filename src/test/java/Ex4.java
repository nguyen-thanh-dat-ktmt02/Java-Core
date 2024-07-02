import java.util.Scanner;

public class Ex4 {
    void question01(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một xâu ký tự: ");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("số từ la: " + count);
    }

    void question02(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một xâu ký tự: ");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào một xâu ký tự: ");
        String s2 = scanner.nextLine();
        System.out.println(s1+s2);
    }

    void question03(){
        //dAt -> Dat
        //DAT -> Dat
        //daT -> Dat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một xâu ký tự: ");
        String name = scanner.nextLine();
        String  name1= name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
        System.out.println("name1 = " + name1);

    }

    String question10(String s1, String s2){
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 != length2){
            return "KO";
        }
        for(int i = 0; i < length1; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(length1-1-i);
            if (c1 != c2){
                return "KO";
            }
        }
        return "OK";
    }
    String question15(String s){
        String[] word = s.split(" ");
        String result = "";
        for (int i = word.length - 1; i>=0; i--){
            result += word[i]+ " ";
        }
        return result.trim();
    }
}
