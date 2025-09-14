package WEEK10.homework10;

public class questions2 {
    public static void mediumPattern(int n){
        for (int i = 0; i < 2*n-1; i++) {
            int total = i<n ? i : 2*n-i-2;
            for (int j = 0; j < n-total; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void displayDiamondPattern(int n){
        for(int i=0;i<2*n-1;i++){
            int total = i<n ? i : 2*n-i-2;
            for(int j=0;j<n-total-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*total+1;j++){
                System.out.print("*");
            }   
            System.out.println();
        }
    }
    public static void main(String[] args){
        mediumPattern(7);
        displayDiamondPattern(5);
    }
}
