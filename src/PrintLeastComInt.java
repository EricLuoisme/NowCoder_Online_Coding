import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintLeastComInt {

    public String PrintMinNumber(int [] numbers) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            list.add(numbers[i]);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a_b = o1 + "" + o2;
                String b_a = o2 + "" + o1;
                return a_b.compareTo(b_a);
            }
        });

        String result = "";
        for (int num : list){
            result += Integer.toString(num);
        }
        return result;
    }

    public static void main(String[] args) {
        PrintLeastComInt use = new PrintLeastComInt();
        int[] test = new int[]{10, 1, 0, 25, 20, 26, 21, 22, 23};

        System.out.println(use.PrintMinNumber(test));
    }

}
