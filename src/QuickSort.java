import java.awt.geom.QuadCurve2D;

public class QuickSort {

    public int[] swapArrayEle (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public int partitionQuickSort(int[] arr, int low, int high){
        int pivot = arr[high];
        int swap_p = low;
        for (int j = low; j < high; j++){
            if (arr[j] < pivot){
                arr = this.swapArrayEle(arr, swap_p, j);
                swap_p++;
            }
        }
        arr = this.swapArrayEle(arr, swap_p, high);
        return swap_p;
    }

    public void quickSort(int[] arr, int low, int high){

        if (low < high){
            int mid_pivot = this.partitionQuickSort(arr, 0,  high);
            quickSort(arr, low, mid_pivot - 1);
            quickSort(arr, mid_pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort qu = new QuickSort();
        int[] test = new int[]{1, 6, 7, 8, 3, 2, 5};
        qu.quickSort(test, 0, test.length - 1);
        for (int i : test)
            System.out.println(i);
    }

}
