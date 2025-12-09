import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            reader = new FileReader("nonexistent.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            }
            catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}