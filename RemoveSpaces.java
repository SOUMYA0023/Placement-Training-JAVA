import java.util.Scanner;

public class RemoveSpaces {
    static void removeSpaces(String s) {
        String result = "";
        for (char c : s.toCharArray()) {
            if (c != ' ')
                result += c;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        removeSpaces(input);
    }
}