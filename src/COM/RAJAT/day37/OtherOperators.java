package COM.RAJAT.day37;

public class OtherOperators {
    public static void main(String [] args) {
        int a = 8, b = 4;
        System.out.println("Relational Operators:");
        System.out.println(a == b);     // checks if a equals b
        System.out.println(a != b);     // checks if a is not equal to b
        System.out.println(a > b);      // checks if a is greater than b
        System.out.println(a < b);      // checks if a is less than b
        System.out.println(a >= b);     // checks if a is greater than or equal to b
        System.out.println(a <= b);   // checks if a is less than or equal to b

        System.out.println("Logical Operators:");
        boolean c = true, d = false;
        System.out.println(c && d);  //AND:- true only if both condition are true
        System.out.println(c || d);  //OR:- true if at least one condition is true
        System.out.println(!c);      //NOT:- checks if the condition is false

        System.out.println("Terniary Operator:");
        int x = 7;
        int y = 10;
        boolean z = (x > y) ? true : false;
        System.out.println(z);
    }
}