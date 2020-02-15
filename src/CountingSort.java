public class CountingSort {

    public void countingSort(int[] arr){

        int[] output = new int[arr.length];

        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i])
                max = arr[i];
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;

        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        for (int i = 0; i < arr.length; i++){
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];

    }

    public static void main(String[] args) {
        CountingSort use = new CountingSort();
        int[] test = new int[]{1, 6, 7, 8, 3, 2, 5};
        use.countingSort(test);
        for ( int i = 0; i < test.length; i++)
            System.out.println(test[i]);
    }
}
