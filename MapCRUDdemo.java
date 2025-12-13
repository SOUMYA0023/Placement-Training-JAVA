import java.util.*;

public class MapCRUDdemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // CREATE using put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("Initial Map: " + map);

        // READ using get()
        System.out.println("Value at key 2: " + map.get(2));

        // UPDATE (put again on same key replaces value)
        map.put(3, "Orange");
        System.out.println("After Update (3 -> Orange): " + map);

        // DELETE using remove()
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // containsKey & containsValue
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        // size of map
        System.out.println("Size of map: " + map.size());

        // keySet() -> gives all keys
        System.out.println("Keys: " + map.keySet());

        // values() -> gives all values
        System.out.println("Values: " + map.values());
    }
}