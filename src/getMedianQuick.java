import java.util.Comparator;
import java.util.PriorityQueue;

public class getMedianQuick {
    /*
    About maintaining one Max_heap and one Min_heap,
    We can pick up the median super quick.
    Max_heap is used to store the 'small' numbers of the whole (on high side),
    Min_heap is used to store the 'big' numbers of the whole (on low side).
    we can get the Median by checking Count is even or odd.
    odd: peek the Max_heap, even: peek the Min_heap.
     */


    private int count = 0; // to show total ele's number we stored is odd or even
    private PriorityQueue<Integer> small_high = new PriorityQueue<>(); // to ascending store all even elements
    private PriorityQueue<Integer> big_low = new PriorityQueue<>(new Comparator<Integer>() {
        // to decending store all odd elements
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 .compareTo(o1);
        }
    });

    public void Insert(Integer num) {
        this.count++;

        if (this.count % 2 == 1){
            // current ele would be odd, but we still need to check whether this ele
            // is greater than the minimise one in Min_heap, we need to add this one
            // into the Min_heap, then pop the minimised one and add it to Max_heap
            if (!small_high.isEmpty() && num > small_high.peek()){
                small_high.offer(num);
                num = small_high.poll();
            }
            big_low.offer(num);
        } else {
            // similar to above, but for even.

            if (!big_low.isEmpty() && num < big_low.peek()){
                big_low.offer(num);
                num = big_low.poll();
            }
            small_high.offer(num);
        }

    }

    public Double GetMedian() {
        double result = 0.0;
        if (this.count % 2 == 1){
            result =  big_low.peek();
        } else {
            result = (big_low.peek() + small_high.peek()) / 2.0;
        }
        return result;
    }
}
