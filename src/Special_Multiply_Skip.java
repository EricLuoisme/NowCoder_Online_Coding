public class Special_Multiply_Skip {
    public int[] multiply(int[] A) {
        if (A == null || A.length <= 1)
            return null;
        int[] B = new int[A.length];
        B[0] = 1;
        // for the down triangle
        for (int i = 1; i < A.length; i++){
            B[i] = B[i - 1] * A[i - 1];
        }
        // for upper triangle
        int mulmuliply = 1;
        for (int i = A.length - 1; i >= 0; i--){
            B[i] *= mulmuliply;
            mulmuliply *= A[i];
        }
        return B;
    }

    public static void main(String[] args) {
        Special_Multiply_Skip use = new Special_Multiply_Skip();
        int[] test = new int[]{1, 2, 5, 6};
        int[] result = use.multiply(test);
        for (int i: result)
            System.out.println(i);
    }
}
