import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class TaskIterator {

    public static void iterateTasks() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<String> tasks = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            tasks.add(sc.next());
        }

        System.out.println("Using for-each:");
        for (String task : tasks) {
            System.out.println(task);
        }

        System.out.println("Using iterator:");
        Iterator<String> it = tasks.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        iterateTasks();
    }
}