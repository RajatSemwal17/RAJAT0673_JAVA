package COM.RAJAT.day40;

import java.util.*;

public class KBoatStringPattern {
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sin.nextLine();
        int len = word.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
