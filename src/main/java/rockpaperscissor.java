import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Rock, Paper, Scissors!");
        System.out.println("Enter choice (rock, paper, scissors):");
        
        String p = s.nextLine().toLowerCase();
        String c = r.nextInt(3)==0?"rock":r.nextInt(3)==1?"paper":"scissors";
        
        System.out.println("Computer: " + c);
        
        if (p.equals(c)) System.out.println("Tie!");
        else if ((p.equals("rock")&&c.equals("scissors"))||(p.equals("paper")&&c.equals("rock"))||(p.equals("scissors")&&c.equals("paper"))) 
            System.out.println("You win!");
        else System.out.println("Computer wins!");
        
        s.close();
    }
}