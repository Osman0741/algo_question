import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoSortedArrayList {



    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,5,9);
        List<Integer> list2 = Arrays.asList(2,4,8);
        System.out.println(merge(list1, list2));


    }
    public static List<Integer> merge(List<Integer> list1, List<Integer>list2){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i));

        }
        for (int i = 0; i < list2.size(); i++) {
            result.add(list2.get(i));

        }
        return result.stream().sorted().collect(Collectors.toList());
    }
}
