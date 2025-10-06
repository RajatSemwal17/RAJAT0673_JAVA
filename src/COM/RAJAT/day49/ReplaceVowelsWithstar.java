package COM.RAJAT.day49;

public class ReplaceVowelsWithstar {
    public static void print(char[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        String name = "RAJAT SEMWAL IS A GOOD BOY";
        name = name.toLowerCase();
        char[] arr = name.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
                arr[i] = '*';
            }
        }
        print(arr);
    }
}
