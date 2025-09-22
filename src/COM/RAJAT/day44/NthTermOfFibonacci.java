package COM.RAJAT.day44;

public class NthTermOfFibonacci {
    public static int NthFibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return NthFibonacci(n-1) + NthFibonacci(n-2);
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(NthFibonacci(n-1));
    }
}
