package COM.RAJAT.day43;
import java.util.Scanner;
public class cache {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] cache = new String[n];
        for(int i=0;i<n;i++){
            cache[i] = sc.next();
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(cache[i] + " ");
        }
        System.out.print("]");
    }

}
