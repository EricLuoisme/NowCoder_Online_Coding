import java.util.HashMap;

public class MoreThanHalfNum_Solution_S {

    public int MoreThanHalfNum_Solution(int [] array) {

        if (array.length == 1)
            return array[0];

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < array.length; i++){
            if (freqMap.containsKey(array[i])){
                int curFreq = freqMap.get(array[i]);
                if (curFreq + 1 > array.length/2)
                    return array[i];
                else
                    freqMap.put(array[i], freqMap.get(array[i]) + 1);
            } else {
                freqMap.put(array[i], 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MoreThanHalfNum_Solution_S use = new MoreThanHalfNum_Solution_S();
        int[] test = new int[]{1,2,3,2,2,2,5,4,2};
        System.out.println(use.MoreThanHalfNum_Solution(test));
    }
}
