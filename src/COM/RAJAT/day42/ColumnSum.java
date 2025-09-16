package COM.RAJAT.day42;

public class ColumnSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {5, 3, 1}, {7, 2, 4}};

        for (int i=0;i<matrix[0].length;i++) {
            int sum = 0;
            for (int j=0;j<matrix.length;j++) {
                sum += matrix[j][i];
            }
            System.out.println(sum);
        }
    }
}
