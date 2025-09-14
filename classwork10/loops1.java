package WEEK10.classwork10;

public class loops1 {
    public static void solidRectangle(int n, int m){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rightTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void invertedRightTriangle(int n){
        for(int i=n-1;i>=0;i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void numberPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        solidRectangle(5,4);
        rightTriangle(5);
        invertedRightTriangle(5);
        numberPattern(5);
    }
}
