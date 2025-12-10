import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        // Declare a HashSet to store String elements
        HashSet<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");   // Adding a duplicate element, which will be ignored

        System.out.println("Fruits in HashSet: " + fruits); 
        // Output order is not guaranteed

        // Check if an element exists
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Remove an element
        fruits.remove("Orange");
        System.out.println("Fruits after removing Orange: " + fruits);

        // Check if the set is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is HashSet empty: " + isEmpty);
    }
}