public class Palindrome_Two_Pointer {
    public static void main(String[] args) {
       String s="abba";
       int n=s.length();
        char char_arr[]=s.toCharArray();
        int i=0;int j=n-1;
        while(i<=j){
            if(char_arr[i]!=char_arr[j]){
                System.out.println("Not a paindrome");
                break;
            }
            i++;j--;
            if(i<=j){
                System.out.println("String is a palindrome");
            }
        }
    }
}