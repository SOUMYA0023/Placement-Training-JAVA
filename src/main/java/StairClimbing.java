public class StairClimbing {
    public static void main(String[] args) {
        int[] stairs = {3, 5, 6, 9, 10, 12};
        int count = 0;
        for (int i = 0; i < stairs.length; i++) {
            if (stairs[i] % 3 == 0) count++;
        }
        System.out.println(count);
    }
}