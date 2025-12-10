// Java program to demonstrate the working of a HashSet

import java.util.*;

public class HashSetDemo {

    public static void main(String args[]) {

        // Creating HashSet and adding elements
        HashSet<String> hs = new HashSet<String>();
        hs.add("Java");
        hs.add("Programming");
        hs.add("Language");
        hs.add("For");
        hs.add("Education");

        // Traversing elements
        Iterator<String> itr = hs.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}