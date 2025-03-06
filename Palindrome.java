//Check Palindrome without using 2 Pointer Approach
import java.util.Arrays;
public class Palindrome {
    public static void main(String[] args) {
        String s="abcba";
        int n=s.length();
        char rev_arr[]=new char[n];
        char char_arr[]=s.toCharArray();
        //Approach1
        for(int i=0;i<n;i++){
            rev_arr[i]=char_arr[n-i-1];
        }
        if(Arrays.equals(rev_arr,char_arr)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
        //Approach 2
        for(int i=0;i<n/2;i++){
           if(char_arr[i]!=char_arr[n-1-i]){
            System.out.println("Not a Palindrome");
            break;
           } 
        }
    }
}