import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter three scores:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        int second;
        if ((a >= b && a <= c) || (a >= c && a <= b)) second = a;
        else if ((b >= a && b <= c) || (b >= c && b <= a)) second = b;
        else second = c;
        
        System.out.println("Second highest score: " + second);
        
        s.close();
    }
}