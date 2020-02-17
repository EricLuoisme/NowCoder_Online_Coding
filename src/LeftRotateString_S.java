public class LeftRotateString_S {

    public String LeftRotateString(String str,int n) {

        if(str == null || str.length() == 0)
            return str;
        int realR = n % str.length();
        String comb = str + str;
        return comb.substring(realR, str.length() + realR);

    }

    public static void main(String[] args) {

        LeftRotateString_S use = new LeftRotateString_S();
        System.out.println(use.LeftRotateString("abcdefg", 3));

    }

}
