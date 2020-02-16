import java.util.ArrayList;

public class FindContinuousSequenceSum {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int low = 0;
        int high = 1;
        int cur_sum = low + high;
        int stop_point = (int)Math.floor(sum / 2) + 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while (high <= stop_point){
            if (cur_sum < sum){
                high++;
                cur_sum += high;
            } else if (cur_sum > sum){
                cur_sum -= low;
                low++;
            } else { // cur_sum == sum
                ArrayList<Integer> temp_arr = new ArrayList<>();
                for (int i = low; i <= high; i++)
                    temp_arr.add(i);
                result.add(temp_arr);
                high++; // or else just loop here
                cur_sum += high;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindContinuousSequenceSum use = new FindContinuousSequenceSum();
        ArrayList<ArrayList<Integer>> store = use.FindContinuousSequence(100);
        for (ArrayList<Integer> onelist: store)
            System.out.println(onelist);
    }
}
