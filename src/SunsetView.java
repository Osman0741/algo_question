import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetView {

    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetView(buildings,"east").forEach(System.out::println);

    }
    public static ArrayList<Integer> sunsetView(int[] buildings, String direction){

        Stack<Integer> stack = new Stack<>();
        if(direction.equalsIgnoreCase("east")){
            for (int i = 0; i < buildings.length; i++) {
                while(!stack.isEmpty() && buildings[i] >= buildings[stack.peek()] ){
                    stack.pop();
                }
                stack.push(i);
            }
        }else {
            for (int i = buildings.length-1; i >= 0; i--) {
                while(!stack.isEmpty() && buildings[i]>= buildings[stack.peek()] ){
                    stack.pop();
                }
                stack.push(i);
                Collections.reverse(stack);
            }
        }

        return new ArrayList<>(stack);
    }
}
