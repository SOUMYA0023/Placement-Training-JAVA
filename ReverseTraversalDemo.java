import java.util.LinkedList;
import java.util.Iterator;

public class ReverseTraversalDemo {
    public static void main(String[] args) {

        // Create a LinkedList of city names
        LinkedList<String> cities = new LinkedList<>();

        // Add elements to the LinkedList
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");

        // Print original order
        System.out.println("Original Order:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Use descendingIterator() for reverse traversal
        System.out.println("\nReverse Order:");
        Iterator<String> iterator = cities.descendingIterator();

        // Traverse backwards
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}