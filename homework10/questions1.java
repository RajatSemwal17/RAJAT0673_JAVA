package WEEK10.homework10;

public class questions1 {
    public static void hashSquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void numberSquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        hashSquare(5);
        numberSquare(5);
    }
}
