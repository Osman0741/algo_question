import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums ={4,4,4,5,5,9,9,5,8,7,7,1,1,3,3,3};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for (int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                count = map.get(num);
                map.put(num, count+1);
            }
        }
        int result=0;
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1) {
                result = integer;
            }
        }

      return result;
    }

}
