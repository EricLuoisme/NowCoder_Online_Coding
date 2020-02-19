import java.util.HashMap;
import java.util.Scanner;

public class HuaweiTesting_1 {

    HashMap<Integer, Integer> studentScores;

    public void saveSudentInfo(String input) {
        this.studentScores = new HashMap<>();
        String[] scores = input.split(" ");
        for (int i = 1; i <= scores.length; i++){
            studentScores.put(i, Integer.parseInt(scores[i - 1]));
        }
    }

    public void getStudentInfo(String[] input){
        int stu_1 = this.studentScores.get(Integer.parseInt(input[1]));
        int stu_2 = this.studentScores.get(Integer.parseInt(input[2]));
        if (stu_1 - stu_2 > 0)
            System.out.println(stu_1);
        else
            System.out.println(stu_2);
    }

    public void updateStudentInfo(String[] input) {
        this.studentScores.put(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
    }

    public static void main(String[] args) throws Exception {

        HuaweiTesting_1 use = new HuaweiTesting_1();
        Scanner in = new Scanner(System.in);

        // store first line's infos
        String firstLine = in.nextLine();
        String[] str = firstLine.split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        // initialise and store student's infos
        String secondLine =  in.nextLine();
        use.saveSudentInfo(secondLine);

        int cur = 0;
        while (cur++ < m){
            String nextLine = in.nextLine();
            String[] strs = nextLine.split(" ");
            if (strs[0].equals("Q")){
                use.getStudentInfo(strs);
            } else if (strs[0].equals("U")){
                use.updateStudentInfo(strs);
            } else {
                throw new Exception();
            }
        }
    }
}
