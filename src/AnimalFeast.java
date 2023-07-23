public class AnimalFeast {

    public static void main(String[] args) {
        System.out.println(animalFeast("great blue heron", "garlic naan"));
    }

    public static boolean animalFeast(String animal, String dish){

        if(animal.charAt(0)==dish.charAt(0) && animal.charAt(animal.length()-1)==dish.charAt(dish.length()-1)){
            return true;
        }
        return false;
    }
}
