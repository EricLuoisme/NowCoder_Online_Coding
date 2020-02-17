import java.util.Arrays;

public class isContinuou_S {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length < 5 || numbers.length > 5)
            return false;
        Arrays.sort(numbers);
        int has_0 = 0;
        int total_dif = 0;
        for (int i = numbers.length - 2; i >= 0; i--){
            if (numbers[i] == 0){
                has_0++;
                continue;
            } else {
                if (numbers[i + 1] - numbers[i] == 0)
                    return false;
                if (numbers[i + 1] - numbers[i] > 1){
                    total_dif += numbers[i + 1] - numbers[i] - 1;
                }
            }
        }
        if (total_dif == 0 || has_0 >= total_dif)
            return true;
        return false;
    }

    public static void main(String[] args) {
        isContinuou_S use = new isContinuou_S();
        int[] test_1 = new int[]{13, 0, 12, 0, 10};
        int[] test_2 = new int[]{1, 2, 0, 4, 5};
        int[] test_3 = new int[]{5, 7, 10, 8, 9};
        int[] test_4 = new int[]{6, 7, 8, 10, 9};
        int[] test_5 = new int[]{5, 0, 10, 8, 6};
        int[] test_6 = new int[]{1, 5, 0, 0, 0};
        int[] test_7 = new int[]{0, 0, 0, 0, 6};

        System.out.println(use.isContinuous(test_1));
        System.out.println(use.isContinuous(test_2));
        System.out.println(use.isContinuous(test_3));
        System.out.println(use.isContinuous(test_4));
        System.out.println(use.isContinuous(test_5));
        System.out.println(use.isContinuous(test_6));
        System.out.println(use.isContinuous(test_7));

    }
}
