package COM.RAJAT.day51;
import java.util.StringTokenizer;
public class Count_Print_Tokenizer {
    public static void main(String[] args) {
        String s = "hey there how are you";
        StringTokenizer st = new StringTokenizer(s , " ");
        int count = 0;
        while(st.hasMoreTokens()){
            count++;
            st.nextToken();
        }
        System.out.println(count);
    }
}
