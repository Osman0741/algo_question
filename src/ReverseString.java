import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseString {
    public static void main(String[] args) {

        char[] chars = {'h','e','l','l','o'};

        reverse(chars);

    }
    public static void reverse(char[] s){

        int p1 = 0;
        int p2 =s.length-1;
        while(p1<s.length/2){
            char temp = s[p1];
            s[p1++]=s[p2];
            s[p2--]=temp;
        }


    }
}
