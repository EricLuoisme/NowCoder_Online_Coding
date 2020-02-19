import java.util.HashMap;
import java.util.Scanner;

public class HuaweiTesting_2 {

    public int num = 0;
    public String[][] records = new String[8][3];
    public HashMap<String, Combine> fileFullNames = new HashMap<>();


    public class Combine{
        String fileName_Short;
        int rowNum;
        int count;

        public Combine(String fileName_Short, int rowNum){
            this.fileName_Short = fileName_Short;
            this.rowNum = rowNum;
            this.count = 1;
        }
    }

    public void printRecord(){

    }

    public void addRecord(String[] input) {

        String path = input[0];
        String fileName = "";

        for (int i = path.length() - 1; i >= 0; i--){
            if (path.charAt(i) == '\\'){
                fileName = path.substring(i + 1, path.length());
                break;
            }
        }

        if (fileFullNames.containsKey(fileName)){
            Combine cur = fileFullNames.get(fileName);
            cur.count += 1;
            fileFullNames.put(fileName, cur);
            for (int i = 0; i <= this.num; i++){

            }
        } else {
            fileFullNames.put(fileName, 1);
            if (fileName.length() > 16){
                fileName = fileName.substring(fileName.length() - 16, fileName.length());
            }
            this.num++;
            this.records[this.num][0] = fileName;
            this.records[this.num][1] = input[1];

        }



    }


    public static void main(String[] args) {
        HuaweiTesting_2 use = new HuaweiTesting_2();
        Scanner in = new Scanner(System.in);

        while (use.num < 8){
            String thisLine = in.nextLine();
            String[] strs = thisLine.split(" ");
            if (strs[0] == "stop")
                break;
            else
                use.addRecord(strs);
        }

        use.printRecord();
    }
}
