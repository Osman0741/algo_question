import java.util.Arrays;
import java.util.HashMap;

public class TwoSumTwoPointerStrategy {

    public static void main(String[] args) {
       int[] nums={16,3,11,5,15};

      //  System.out.println(Arrays.toString(twoSum(nums, 20)));
        System.out.println(Arrays.toString(findIndices(nums, 8)));

    }
    public static int[] twoSum(int[] arr, int target){

        int first = 0;
        int last = arr.length-1;
        Arrays.sort(arr);

        while(first<last){
            if(arr[first]+arr[last]==target){
                return new int[]{arr[first],arr[last]};
            } else if (arr[first]+arr[last]<target) {
                first++;
            }else {
                last--;
            }
        }
        return new int[]{0};
    }

    public static int[] findIndices(int[] arr, int target){
        int first = 0;
        int last =arr.length-1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        while(first<last){
            if(arr[first]+arr[last]==target){
                return new int[]{map.get(arr[first]), map.get(arr[last])};
            } else if (arr[first]+arr[last]<target) {
                first++;
            }else {
                last--;
            }
        }
        return new int[] {0};
    }
}
