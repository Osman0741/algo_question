import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

//        String [] strings = {"abcd","abc","ab"};
//        System.out.println(longestCommonPrefix(strings));

                String [] strings = {"abcd","abc","ab"};
        System.out.println(longestCommonPrefix2(strings));

    }
    public static String longestCommonPrefix(String[] strs){

        String result = "";
        if(strs.length==0) return result;
        String prefix =strs[0];
        for (int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    public static String longestCommonPrefix2(String[] strings){

        StringBuilder result = new StringBuilder();
        if(strings.length==0) return result.toString();
        Arrays.sort(strings);
        char[] first = strings[0].toCharArray();
        char[] last = strings[strings.length-1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if(first[i] != last[i]) break;
            result.append(first[i]);
        }
        return result.toString();
    }
}
