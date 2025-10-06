package COM.RAJAT.day50;
import java.util.Scanner;

public class appendInsert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer(sc.next());
        s = new StringBuffer(s.append(" JAVA❤️❤️"));
        s = new StringBuffer(s.insert(s.length() , " WITH FUN"));
        System.out.println(s);
    }
}
