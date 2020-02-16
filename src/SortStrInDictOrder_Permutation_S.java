import java.util.ArrayList;
import java.util.Collections;

public class SortStrInDictOrder_Permutation_S {
    private ArrayList<String> result;

    public ArrayList<String> Permutation(String str) {

        this.result = new ArrayList<>();
        if (str.length() == 0 || str == null)
            return result;

        permute(str, 0, str.length() - 1);
        Collections.sort(result);
        return result;
    }

    public void permute(String str, int left, int right){
        if (left == right){
            if (!result.contains(str))
                this.result.add(str);
        } else {
            for (int i = left; i <= right; i++){
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public String swap(String str, int i, int j){
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

    public static void main(String[] args) {

        String test = "abc";
        SortStrInDictOrder_Permutation_S use = new SortStrInDictOrder_Permutation_S();
        System.out.println(use.Permutation(test));

    }
}
