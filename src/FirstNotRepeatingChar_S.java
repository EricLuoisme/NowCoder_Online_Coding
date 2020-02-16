import java.util.HashMap;

public class FirstNotRepeatingChar_S {
    public int FirstNotRepeatingChar(String str) {

        if (str.length() == 0 || str == null)
            return 0;

        if (str.length() == 1)
            return Integer.parseInt(str);

        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            if (freqMap.containsKey(str.charAt(i))){
                freqMap.put(str.charAt(i), freqMap.get(str.charAt(i)) + 1);
            } else {
                freqMap.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); i++){
            if (freqMap.get(str.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstNotRepeatingChar_S use = new FirstNotRepeatingChar_S();

        String str = "google";
        System.out.println(use.FirstNotRepeatingChar(str));
    }
}
