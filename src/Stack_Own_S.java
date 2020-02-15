import java.util.Stack;

public class Stack_Own_S {

    public int min;
    public int dif = 0;
    public Stack<Integer> stack_sub = new Stack<>();

    public void push(int node) {
        if (stack_sub.isEmpty()){
            min = node;
            stack_sub.push(0);
        } else if (node < min) {
            dif = min - node;
            min = node;
        }
        stack_sub.push(node - min - dif);
    }

    public void pop() {
        int this_pop = stack_sub.pop();
        if (this_pop + dif == 0){
            min = min + dif;
            dif = 0;
        }
    }

    public int top() {
        int top_one = stack_sub.pop();
        int real_top = top_one + min + dif;
        stack_sub.push(top_one);
        return real_top;
    }

    public int min() {
        return min;
    }

    public static void main(String[] args) {
        Stack_Own_S test = new Stack_Own_S();

        test.push(3);
        test.push(6);
        test.push(7);
//        System.out.println(test.min);
//        System.out.println(test.dif);
//        System.out.println(test.stack_sub);
//        System.out.println(test.top());
//        System.out.println(test.min);
//        System.out.println(test.dif);
//        System.out.println(test.stack_sub);
        test.push(2);
        test.push(10);
        test.pop();
        System.out.println(test.min);
        System.out.println(test.dif);
        System.out.println(test.stack_sub);
        System.out.println(test.top());
        System.out.println(test.min);
        System.out.println(test.dif);
        System.out.println(test.stack_sub);
        test.pop();
        System.out.println(test.min);
        System.out.println(test.dif);
        System.out.println(test.stack_sub);
        System.out.println(test.top());
        System.out.println(test.min);
        System.out.println(test.dif);
        System.out.println(test.stack_sub);

    }
}
