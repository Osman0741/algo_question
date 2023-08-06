import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] numbers = {9, 9, 9};
        plusOne(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] new_digits = new int[n + 1];
        new_digits[0] = 1;
        return new_digits;
    }

}

