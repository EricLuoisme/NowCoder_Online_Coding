import java.util.ArrayList;

public class LeastKNumbers {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        if (k > input.length)
            return null;

        ArrayList<Integer> result = new ArrayList<>();
        quickSort(input, 0, input.length - 1);
        for (int i = 0; i < k; i++)
            result.add(input[i]);

        return result;
    }

    public int[] swapInt(int[] input, int i, int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        return input;
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int pointer = low;
        for (int i = low; i < high; i++){
            if (arr[i] < pivot){
                arr = swapInt(arr, i, pointer);
                pointer++;
            }
        }
        arr = swapInt(arr, pointer, high);
        return pointer;
    }

    public void quickSort(int[] arr, int low, int high){

        if(low < high){
            int mid = partition(arr, 0, high);
            quickSort(arr, low, mid - 1);
            quickSort(arr, mid + 1, high);
        }
    }

    public static void main(String[] args) {

        LeastKNumbers use = new LeastKNumbers();
        int[] test = new int[]{4,5,1,6,2,7,3,8};
        use.quickSort(test, 0, test.length - 1);
        System.out.println(use.GetLeastNumbers_Solution(test, 4));
    }

}
