import java.util.Stack;

public class Stack_build_Queue {

    public class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            while (!stack1.isEmpty()){
                int thisone = stack1.pop();
                stack2.push(thisone);
            }
            int ret = stack2.pop();
            while (!stack2.isEmpty()){
                int thisone = stack2.pop();
                stack1.push(thisone);
            }
            return ret;
        }
    }
}
