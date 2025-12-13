import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // 3. Access element
        System.out.println("Element at index 2: " + fruits.get(2));

        // 4. Modify element
        fruits.set(1, "Pineapple"); // Replaces "Mango" with "Pineapple"
        System.out.println("After modifying index 1: " + fruits);

        // 5. Insert at specific index
        fruits.add(2, "Kiwi");
        System.out.println("After inserting at index 2: " + fruits);

        // 6. Remove by index
        fruits.remove(3); // Removes "Banana"
        System.out.println("After removing index 3: " + fruits);

        // 7. Remove by value
        fruits.remove("Apple");
        System.out.println("After removing 'Apple': " + fruits);

        // 8. Check if element exists
        System.out.println("Contains 'Kiwi'? " + fruits.contains("Kiwi"));

        // 9. Get size
        System.out.println("Size of the list: " + fruits.size());

        // 10. Sort the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // 11. Iterate using for-each
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 12. Iterate using iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 13. Clear all elements
        fruits.clear();
        System.out.println("After clearing: " + fruits);

        // 14. Check if empty
        System.out.println("Is list empty? " + fruits.isEmpty());
    }
}