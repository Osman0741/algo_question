import java.util.*;
import java.util.stream.Collectors;

public class TheAnimalsWentInTwoByTwo {


    public static void main(String[] args) {

        List<String> animals = Arrays.asList("goat","dog","dog","goat");
   //     System.out.println(getPairs(animals));
        System.out.println(getPairsOptimal(animals));

    }
    public static Map<String,Integer> getPairs(List<String> animals){

        Map<String,Integer> result = new HashMap<>();

        for (int i = 0; i < animals.size(); i++) {
            int count=0;
            for (int j = 0; j < animals.size(); j++) {
                if(animals.get(i).equals(animals.get(j))){
                    count++;
                }
            }
            if(count>1){
                result.put(animals.get(i),count);
            }
        }
        return result;
    }
    public static Map<String,Integer> getPairsOptimal(List<String> animals){

        Map<String, Integer> map = new HashMap<>();
        int count;
        for (int i = 0; i < animals.size(); i++) {
            if(!map.containsKey(animals.get(i))){
                map.put(animals.get(i),1);
            }else {
                count=map.get(animals.get(i));
                map.put(animals.get(i),count+1);
            }
        }
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1){
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
    public static Map<String, Integer> pairOfAnimals(List<String> animals) {

        Map<String, Integer> pair = new HashMap<>();

        for (String animal : animals) {

            int count = pair.getOrDefault(animal, 0);

            if (count < 2) {
                pair.put(animal, ++count);
            }

        }

        pair.entrySet().removeIf(each -> each.getValue() == 1);



        return pair;
    }
    public static Map<String, Integer> getPairs2(List<String> animals) {
        return animals.stream()
                .collect(Collectors.groupingBy(animal -> animal, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> 2));
    }

}
