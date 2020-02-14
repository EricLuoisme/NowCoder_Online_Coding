import java.util.ArrayList;

public class printMatrix_S {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (matrix.length == 1){
            ret.add(matrix[0][0]);
            return ret;
        }
        int i_u = 0;
        int i_d = matrix.length - 1;
        int j_l = 0;
        int j_r = matrix[0].length - 1;
        int i=0, j=0;
        while (true){
            for (; j <= j_r; j++)
                ret.add(matrix[i][j]);
            j--;
            i++;
            i_u++;
            if (i_u > i_d)
                break;

            for (; i <= i_d; i++)
                ret.add(matrix[i][j]);
            i--;
            j--;
            j_r--;
            if (j_l > j_r)
                break;

            for (; j >= j_l; j--)
                ret.add(matrix[i][j]);
            j++;
            i--;
            i_d--;
            if (i_u > i_d)
                break;

            for (; i >= i_u; i--)
                ret.add(matrix[i][j]);
            i++;
            j++;
            j_l++;
            if (j_l > j_r)
                break;

        }
        return ret;
    }

    public static void main(String[] args) {

        printMatrix_S ps = new printMatrix_S();

        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] matrix_2 = {{1,2}, {3,4}};

        System.out.println(ps.printMatrix(matrix));
        System.out.println(ps.printMatrix(matrix_2));

    }
}
