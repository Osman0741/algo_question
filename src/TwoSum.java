import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        Integer[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 4)));

        System.out.println(Arrays.toString(twoSum2(arr, 22)));


    }

    //Bruteforce Solution
    public static Integer[] twoSum(Integer[] array, Integer target) {

        //   Integer[] result = new Integer[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == target) {
                        return new Integer[]{i, j};
                    }
                }
            }
        }
        return new Integer[]{};
    }

    public static Integer[] twoSum2(Integer[] array, Integer target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            int difference = target - array[i];

            if (map.containsKey(difference) && map.get(difference) != i) {
                return new Integer[]{map.get(difference), i};
            }
        }
        return array;
    }
}

