package COM.RAJAT.day44;

public class RecursiveCountDown {
    public static int CountDown(int n){
        if(n==0) return 0;
        System.out.print(n + " ");
        return CountDown(n-1);
    }
    public static void main(String[] args){
        CountDown(10);
    }
}
