import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String text = sc.nextLine().toLowerCase(); // case-insensitive

        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+"); // remove punctuation
        HashSet<String> unique = new HashSet<>(Arrays.asList(words));

        System.out.println("\nUnique words:");
        for (String w : unique) System.out.println(w);
    }
}