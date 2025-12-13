import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sort(Stack<Integer> input) {
        Stack<Integer> helper = new Stack<>();

        while (!input.isEmpty()) {
            int temp = input.pop();

            // Move elements back to input if they are bigger than temp
            while (!helper.isEmpty() && helper.peek() > temp) {
                input.push(helper.pop());
            }

            // Correct spot found
            helper.push(temp);
        }

        return helper;  // helper now has sorted stack with smallest on top
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(92);
        s.push(23);

        Stack<Integer> sorted = sort(s);

        System.out.println("Sorted stack:");
        while (!sorted.isEmpty()) {
            System.out.println(sorted.pop());
        }
    }
}