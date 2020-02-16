import java.util.HashMap;
import java.util.Map;

public class FindNumsAppearOnce_S {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            if (freqMap.containsKey(array[i])){
                freqMap.put(array[i], freqMap.get(array[i]) + 1);
            } else {
                freqMap.put(array[i], 1);
            }
        }

        int[] result = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            if (entry.getValue() == 1)
                result[i++] = entry.getKey();
            if (i == 2)
                break;
        }

        num1[0] = result[0];
        num2[0] = result[1];
    }
}
