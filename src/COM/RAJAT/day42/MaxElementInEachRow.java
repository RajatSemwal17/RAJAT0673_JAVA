package COM.RAJAT.day42;
public class MaxElementInEachRow {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {5, 3, 1}, {7, 2, 4}};
        for (int i = 0; i < matrix.length; i++) {
            int maxi = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxi) {
                    maxi = matrix[i][j];
                }
            }
            System.out.println(maxi);
        }
    }
}
