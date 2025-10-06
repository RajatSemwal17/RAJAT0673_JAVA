package COM.RAJAT.day51;
import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String str = "HTML, CSS, PYTHON, JS, C, C++, JAVA, REACT";
        StringTokenizer st = new StringTokenizer(str, ", ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
