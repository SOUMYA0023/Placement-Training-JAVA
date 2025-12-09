public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            String[] data = { "10", "20", "abc" };
            int num = Integer.parseInt(data[2]);   // Causes NumberFormatException
            System.out.println("Number: " + num);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range.");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert non-numeric data to integer.");
        }
        finally {
            System.out.println("Multiple catch demo finished.");
        }
    }
}