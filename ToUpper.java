import java.util.Scanner;

public class ToUpper {
    static void toUpper(String s) {
        String result = "";
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                result += (char)(c - 32);
            else
                result += c;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        toUpper(input);
    }
}