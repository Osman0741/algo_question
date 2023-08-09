import java.util.HashMap;

public class UniqueCharacterOptimal {

    public static void main(String[] args) {
        String str="aaabbbccccddeff";
        System.out.println(uniqueCharacter(str));
    }
    public static Character uniqueCharacter(String str){

        HashMap<Character, Integer> map = new HashMap<>();
        int count ;
        for (char ch : str.toCharArray()) {
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                count =map.get(ch);
                map.put(ch, count+1);
            }
        }
        for (Character character : map.keySet()) {
            if(map.get(character)==1){
                return character;
            }
        }

        return null;
    }
}
