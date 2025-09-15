package COM.RAJAT.day38;

public class WhileDowhile {
    public static void main(String [] args){
        System.out.println("While loop with true condition");
        int i = 10;
        while(i>0){
            System.out.println(i);
            i--;
        }
        System.out.println("While loop with false condition");
        int y = 10;
        while(y>11){
            System.out.println(y);
            y--;
        }
        System.out.println("Do-While loop with condition being true every time:");
        int j = 10;
        do{
            System.out.println(j);
            j--;
        }while(j>0);
        System.out.println("Do-While loop with condition being false (runs atleast once):");
        int z = 10;
        do {
            System.out.println(z);
            z--;
        }while(z>11);
    }
}