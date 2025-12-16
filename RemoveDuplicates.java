import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    static void removeDuplicates(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char c : set) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        removeDuplicates(input);
    }
}