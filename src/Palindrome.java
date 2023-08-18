import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {

        String str= " l  e v   el!";
    //    System.out.println(isPalindrome(str));
     //   System.out.println(isPalindromeWithRegex(str));

        System.out.println(isPalindromeWithTwoPointer(str));


    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        String result="";
        String reversed = "";

        for (int i = 0; i <str.length() ; i++) {
            if((str.charAt(i) >='a'&& str.charAt(i) <='z') ||  (str.charAt(i) >='0'&& str.charAt(i) <='9') )
                result += str.charAt(i);
        }

        System.out.println("result = " + result);

        for (int i = result.length()-1; i >=0  ; i--) {
            reversed += result.charAt(i);

        }
        System.out.println("reversed = " + reversed);
        return result.equals(reversed);
    }
    public boolean isPalindrome2(String s) {

        s = s.toLowerCase();

        //char list of the string
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                list.add(c);
            }
        }

        // char list of the reversed string

        List<Character> listReversed = new ArrayList<>();

        for (int i = s.length()-1; i >= 0 ; i--) {
            char d = s.charAt(i);
            if ((d >= 'a' && d <= 'z') || (d >= '0' && d <= '9')) {
                listReversed.add(d);
            }
        }
        return list.equals(listReversed);


    }

    public static boolean isPalindromeWithRegex(String str){

        str = str.toLowerCase().replaceAll("[^A-Za-z0-9]","");

        System.out.println("str = " + str);
        String reversed ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("reversed = " + reversed);

        return str.equals(reversed);
    }

    public static boolean isPalindromeWithTwoPointer(String str){

        str = str.toLowerCase().replaceAll("[^A-Za-z0-9]","");

        int leftIndex=0;
        int rightIndex=str.length()-1;

        while(leftIndex<rightIndex){

            leftIndex++;
            rightIndex--;
             if(str.charAt(leftIndex) == str.charAt(rightIndex)){
                 return true;
             }
        }
        return false;
    }
}
