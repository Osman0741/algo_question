import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;

public class MoveZeroes {

    public static void main(String[] args) {
                   // 1 3 12 0 0
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void moveZeroes(int[] nums){

//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        int count;
//        for (int num : nums) {
//            if (!map.containsKey(num)) {
//                map.put(num, 1);
//            } else {
//                count = map.get(num);
//                map.put(num, count + 1);
//            }
//
//        }
        int j= nums.length;

        for (int i = 0, k=0; i < j && k<j; k++) {

            if(nums[k] !=0 ){
                swap(nums, i++ , k);
            }
        }

    }
    public static void swap(int[] nums, int idx1, int idx2){

        int temp = nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;

    }
}
