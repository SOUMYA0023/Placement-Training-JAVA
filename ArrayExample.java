public class ArrayExample {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            System.out.println("Accessing 5th element: " + arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You are trying to access an invalid array index.");
        }
        finally {
            System.out.println("Array operation completed.");
        }
    }
}