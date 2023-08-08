import java.util.ArrayList;
import java.util.List;

public class RemoveEveryOtherElement {

    public static void main(String[] args) {



    }
    public static Object[] removeEveryOtherElement(Object[] arr){

        List<Object> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i+=2) {
            result.add(arr[i]);

        }
        return result.toArray();
    }
}
