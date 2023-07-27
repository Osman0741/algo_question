public class FindTheIndexOfTheFirstOccurrence {

    public static void main(String[] args) {

    }

    public static int strStr(String haystack, String needle){

        int hayLength = haystack.length();
        int needleLength = needle.length();
        if(hayLength<needleLength)
            return -1;

        for (int i = 0; i <hayLength-needleLength+1 ; i++) {

            if(haystack.charAt(i)==needle.charAt(0)){

                if(haystack.substring(i,needleLength+i).equals(needle))
                    return i;
            }
        }
        return -1;

    }
}
