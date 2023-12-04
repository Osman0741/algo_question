import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }
    public static int majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                count = map.get(num);
                map.put(num,count+1);
            }

        }
        int result=0;
        for(Integer integer : map.keySet()){
            if(map.get(integer)>nums.length/2){
                result = integer;
            }
        }
        return result;

    }
}
