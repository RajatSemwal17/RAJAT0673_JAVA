package COM.RAJAT.day50;
import java.util.Scanner;
public class print2ndChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer(sc.next());
        String upper = s.toString().toUpperCase();
        s = new StringBuffer(upper);
        System.out.println( s.charAt(2));
    }
}