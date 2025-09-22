package COM.RAJAT.day46;

public class SumOfMainDiagonal {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {5, 4, 2}, {5, 2, 2}};
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }
        System.out.println("Sum of Leading diagonal is: " + sum);
    }
}

//HERE THE TIME COMPLEXITY IS O(N) BUT IF WE INCREASE THE SIZE BY DOUBLE THEN COMPLEXITY WILL BE O(2*N).