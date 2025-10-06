package COM.RAJAT.day50;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer(sc.nextLine());
        System.out.println(s.reverse());
    }
}