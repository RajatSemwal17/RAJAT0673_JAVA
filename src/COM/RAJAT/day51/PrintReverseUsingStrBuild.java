package COM.RAJAT.day51;
import java.util.*;
public class PrintReverseUsingStrBuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        StringBuilder s = new StringBuilder(str);
        System.out.println(s.reverse());
    }
}
