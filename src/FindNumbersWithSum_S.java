import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindNumbersWithSum_S {

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {

        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> visited = new HashMap<>();
        int cur_multiply = 100000;

        for (int i = 0; i < array.length; i++) {
            if (visited.containsValue(array[i])) {
                for (Map.Entry<Integer, Integer> entry : visited.entrySet()) {
                    if (entry.getValue() == array[i]) {
                        if (entry.getKey() * array[i] < cur_multiply) {
                            cur_multiply = entry.getKey() * array[i];
                            result = new ArrayList<>();
                            result.add(entry.getKey());
                            result.add(array[i]);
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                visited.put(array[i], sum - array[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        FindNumbersWithSum_S use = new FindNumbersWithSum_S();
        int[] test = new int[]{1, 2, 4, 7, 8, 9, 10};
        ArrayList<Integer> result =  use.FindNumbersWithSum(test, 9);

        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
    }

}
