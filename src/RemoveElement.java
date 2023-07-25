public class RemoveElement {

    public static void main(String[] args) {

        int[] arr ={1,2,8,6,7,2,8};
        System.out.println(removeElement(arr, 2));

    }

    public static int removeElement(int[] nums, int value){


        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=value){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
