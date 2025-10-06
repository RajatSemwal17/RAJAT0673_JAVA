package COM.RAJAT.day51;

public class IsSentencePalindrome {
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("A man, a plan, a canal: Panama");
        String ans = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                ans += c;
            }
        }
        ans = ans.toLowerCase();
        if(isPalindrome(ans)){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
    }
}
