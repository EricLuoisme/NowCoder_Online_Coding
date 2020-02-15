import java.util.Stack;

public class CheckStackInOutQueue {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if (pushA.length != popA.length || pushA.length == 0 || popA.length == 0)
            return false;

        Stack<Integer> store = new Stack<>();
        int j = 0;

        for (int i = 0; i < pushA.length; i++){
            store.push(pushA[i]);
            while (!store.isEmpty() && store.peek() == popA[j]){
                store.pop();
                j++;
            }
        }

        return store.isEmpty();
    }
}
