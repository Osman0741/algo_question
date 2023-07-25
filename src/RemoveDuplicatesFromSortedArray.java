public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] arr ={1,1,1,2,2,3,3,3,3};
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] array){

        int count =1;
        for (int i = 1; i < array.length; i++) {
            if(array[i]!=array[i-1]){
                array[count]=array[i];
                count++;
            }
        }
        return count;
    }
}
