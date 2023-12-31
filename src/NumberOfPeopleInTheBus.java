import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        System.out.println(countPassengers(list));

    }

    public static int countPassengers(ArrayList<int[]> stops){

        return stops.stream().mapToInt(p->p[0] -p[1]).sum();
    }
    public static int countPassengers2(ArrayList<int[]> stops){

        int numOfPeople = 0;
        for (int i = 0; i < stops.size(); i++) {
            numOfPeople = numOfPeople + stops.get(i)[0]-stops.get(i)[1];
        }
        return numOfPeople;
    }

}
