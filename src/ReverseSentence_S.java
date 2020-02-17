import java.util.Stack;
import java.lang.StringBuffer;

public class ReverseSentence_S {
    public String ReverseSentence(String str) {
        Stack<String> store = new Stack<>();

        if (str.length() == 0 || str == null || str.length() == 1)
            return str;

        str = " " + str + " ";
        int start = 0;
        boolean cur_having = false;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' ' && !cur_having){
                cur_having = true;
                start = i;
            }
            if (str.charAt(i) == ' ' && cur_having){
                cur_having = false;
                store.push(str.substring(start, i));
            }
        }
        String result = "";
        while (!store.isEmpty()){
            result +=  store.pop() + " ";
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        ReverseSentence_S use = new ReverseSentence_S();
        String test = " ";
        System.out.println(use.ReverseSentence(test));
        System.out.println("asd");
    }
}
