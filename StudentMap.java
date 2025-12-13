import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Insert at least 5 entries
        students.put(101, "Soumya");
        students.put(102, "Neha");
        students.put(103, "Suman");
        students.put(104, "Sneha");
        students.put(105, "Karan");

        // Display all key-value pairs
        System.out.println("All Students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Ask user for roll number to search
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();

        // containsKey() → Search
        if (students.containsKey(roll)) {
            System.out.println("Found: " + students.get(roll));
        } else {
            System.out.println("Roll number not found");
        }
    }
}