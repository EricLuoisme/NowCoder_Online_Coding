public class Fibonacci {
    public static class Solution {
        public static int Fibonacci(int n) {
            if (n == 1)
                return 1;
            if (n == 2)
                return 1;
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int t = Solution.Fibonacci(3);
        System.out.println(t);
    }
}
