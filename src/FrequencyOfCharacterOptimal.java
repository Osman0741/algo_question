import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacterOptimal {

    public static void main(String[] args) {

        String str ="aaabbbbcccdde"; //a3b4c3d2e1

        System.out.println(frequencyOfCharacter(str));
    }
    public static Map<Character,Integer> frequencyOfCharacter(String str){

        Map<Character, Integer> map = new TreeMap<>();

        char[] chars = str.toCharArray();
        int count ;
        for (int i = 0; i < chars.length; i++) {

            if(!map.containsKey(chars[i])){
                map.put(chars[i],1);

            }else{
                count= map.get(chars[i]);
                map.put(chars[i],count+1);
            }
        }


        return map;
    }
 }
