public class LengthOfLastWord {

    public static void main(String[] args) {

        String str="        How are you     Osman?      ";
        System.out.println(lengthOfLastWord(str));


    }
    public static int lengthOfLastWord(String s){
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ')+1;

        return s.length() - lastIndex;



//        String [] arr =s.split(" ");
//        return arr[arr.length-1].length();
    }
}
