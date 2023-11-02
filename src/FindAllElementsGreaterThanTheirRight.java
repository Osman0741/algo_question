import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindAllElementsGreaterThanTheirRight {

    public static void main(String[] args) {

        int [] array ={10,4,6,3,5};
        System.out.println(find(array));

    }
    public static List<Integer> find(int[] array){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && array[i] >= stack.peek()) {
                stack.pop();
            }
            stack.push(array[i]);
        }
      return new ArrayList<>(stack);
    }
}
/*
Question-1 Find All Elements Greater Than Their Right
Given an unsorted integer array, return all greater elements than all elements present to their right using Stack.
Example:
Input: [10, 4, 6, 3, 5]
Output: [10, 6, 5]
The elements that are greater than all elements to their right are 10, 6, and 5.
10 > 4 & 10 > 6 & 10 > 3 & 10 > 5
 */