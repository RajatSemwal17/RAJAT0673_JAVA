package COM.RAJAT.day49;

public class convertStrToCharArray {
    public static void print(char[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        String name = "RAJAT";
        char[] arr = name.toCharArray();
        print(arr);
        arr[0] = 'X';
        print(arr);
    }
}
