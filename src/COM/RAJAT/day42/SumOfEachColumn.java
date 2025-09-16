package COM.RAJAT.day42;

public class SumOfEachColumn {
    public static void main(String[] args){
        int[][] matrix = {
                {4,6,8,9},
                {8,6,4,3},
                {3,7,9,4},
                {7,5,23,56}
        };
        for(int i=0;i<matrix.length;i++){
            int sum = 0;
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[j][i];
            }
            System.out.println(i+"th column sum = " + sum);
        }
    }
}
