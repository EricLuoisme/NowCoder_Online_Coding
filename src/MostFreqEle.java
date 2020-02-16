import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFreqEle {
    public int GetNumberOfK(int [] array , int k) {

        if (array.length == 1)
            return array[0];

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            if (freqMap.containsKey(array[i])){
                freqMap.put(array[i], freqMap.get(array[i]) + 1);
            } else {
                freqMap.put(array[i], 1);
            }
        }

        return freqMap.get(k);

        // below is about how to get the most frequent element
//        int maxValueInMap = (Collections.max(freqMap.values()));  // This will return max value in the Hashmap
//        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {  // Itrate through hashmap
//            if (entry.getValue() == maxValueInMap) {
//                result = entry.getKey();
//            }
//        }

//        return result;
    }

    public static void main(String[] args) {
        MostFreqEle use = new MostFreqEle();
        int[] test = new int[]{1, 2, 3, 4, 5, 4, 3, 3, 2, 2, 2, 2, 2, 1, 2};
        System.out.println(use.GetNumberOfK(test, 3));
    }
}
