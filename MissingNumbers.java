import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {

        // Example input with some numbers missing
        int[] arr = {1, 2, 4, 6, 7, 9, 10};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        System.out.println("Missing numbers:");
        for (int i = 1; i <= 10; i++) {
            if (!set.contains(i)) System.out.print(i + " ");
        }
    }
}