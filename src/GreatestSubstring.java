public class GreatestSubstring {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0 || array == null)
            return 0;

        int[] sum_store = new int[array.length];
        int max_sum = 0;
        sum_store[0] = array[0];
        for (int i = 1; i < array.length; i++){
            sum_store[i] = Math.max(sum_store[i - 1] + array[i], array[i]);
            if (sum_store[i] > max_sum)
                max_sum = sum_store[i];
        }
        return max_sum;
    }

    public static void main(String[] args) {

        GreatestSubstring use = new GreatestSubstring();

        int[] test = new int[]{-2, 1, 1, 2, -7};
        System.out.println(use.FindGreatestSumOfSubArray(test));

    }
}
