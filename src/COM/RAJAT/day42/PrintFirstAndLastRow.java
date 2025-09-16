package COM.RAJAT.day42;

public class PrintFirstAndLastRow {
    public static void main(String[] args){
        int[][] matrix = {
                {2,4,6},
                {7,8,0},
                {4,2,6},
                {7,9,0}
        };
        int n = matrix.length;
        for(int i=0;i<matrix[0].length;i++){
            System.out.print(matrix[0][i]+" ");
        }
        System.out.println();
        for(int i=0;i<matrix[0].length;i++){
            System.out.print(matrix[n-1][i]+" ");
        }
    }
}
