public class MatrixIndexCheck {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        System.out.println("All index positions and their values:");

        // Loop through all rows
        for (int i = 0; i < matrix.length; i++) {
            // Loop through all columns
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Index [" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}