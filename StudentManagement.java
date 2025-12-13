import java.util.*;

public class StudentManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read initial number of names
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        ArrayList<String> students = new ArrayList<>();

        // read initial names
        for (int i = 0; i < n; i++) {
            students.add(sc.nextLine());
        }

        while (true) {
            String command = sc.next();

            // exit condition
            if (command.equalsIgnoreCase("exit")) {
                break;
            }

            // ADD
            if (command.equalsIgnoreCase("add")) {
                String name = sc.next();
                students.add(name);
            }

            // REMOVE
            else if (command.equalsIgnoreCase("remove")) {
                String name = sc.next();
                students.remove(name);
            }

            // SEARCH
            else if (command.equalsIgnoreCase("search")) {
                String name = sc.next();
                if (students.contains(name)) {
                    System.out.println(name + " found");
                } else {
                    System.out.println(name + " not found");
                }
            }

            // DISPLAY
            else if (command.equalsIgnoreCase("display")) {
                for (String s : students) {
                    System.out.println(s);
                }
            }
        }
    }
}