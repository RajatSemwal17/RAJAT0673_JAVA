package COM.RAJAT.day42;

public class RowSum {
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3}, {5, 3, 1}, {7, 2, 4}};

        for(int[] row : matrix){
            int sum = 0;
            for(int num : row){
                sum += num;
                System.out.print(num+" ");
            }
            System.out.print(" = " + sum);
            System.out.println();
        }

    }
}
