package WEEK10.classwork10;

public class loops2 {
    public static void stairCasePyramidPattern(String str){
        int len = str.length();
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                char c = str.charAt(j);
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pascalTriangle(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num * (i-j) / (j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        stairCasePyramidPattern("INTELLIJ");
        pascalTriangle(5);
    }
}
