package COM.RAJAT.day44;
import java.util.*;
public class DiagonalsProduct {
    public static void main(String[] args){
        int[][] matrix = {
                {1,4,6},
                {6,7,2},
                {1,3,6}
        };
        int product = 1;
        for(int i=0;i<matrix.length;i++){
            if(i == i) {
                product *= matrix[i][i];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i == j){
                    System.out.print(product + " ");
                }
                else System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}