public class Convert2Binary {

    public String Conv2Str(String input) {
        int max = Integer.parseInt(input.substring(0, 1));
        String store = "";
        for (; max >= 0; max--){
            if (input.contains(max + ""))
                store += "1";
            else
                store += "0";
        }
        return store;
    }

    public String NegConv(String input) {
        char[] char_array = input.toCharArray();

        for (int i = 0; i < char_array.length; i++){
            if (char_array[i] == '1')
                char_array[i] = '0';
            else
                char_array[i] = '1';
        }

        boolean add2Head = true;
        for (int i = char_array.length - 1; i >= 0; i--){
            if (char_array[i] == '1')
                char_array[i] = '0';
            else {
                char_array[i] = '1';
                add2Head = false;
                break;
            }
        }

        String ret = String.valueOf(char_array);
        if (add2Head)
            ret = '1' + ret;

        return ret;
    }

    public int Calcul_1(String input) {
        int sum_one = 0;
        char one = '1';
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == one)
                sum_one += 1;
        }
        return sum_one;
    }


    public int NumberOf1(int n) {
        if (n == 0)
            return 0;

        String binar = "";
        boolean negOrNot = false;

        if (n < 0){
            negOrNot = true;
            n = -n;
        }

        int remain = n;
        String save = "";
        while (remain != 0) {
            int i = 0;
            for (; ; i++){
                if (Math.pow(2, i) > remain){
                    i -= 1;
                    break;
                }
            }
            save += i + "";
            remain -= (int)Math.pow(2, i);
        }
        binar = this.Conv2Str(save); // convert to real binary first

        if (negOrNot){
            binar = this.NegConv(binar);
        }

        return this.Calcul_1(binar);
    }

    public static void main(String[] args) {
        Convert2Binary use = new Convert2Binary();

//        int test = 121;
//        use.NumberOf1(test);

//        String test2 = "000";
//        String ret = use.NegConv(test2);
//        System.out.println(ret);

//        String st = "6520";
//        String ret = use.Conv2Str(st);
//        System.out.println(ret);
//        int cal_1 = use.Calcul_1(ret);
//        System.out.println(cal_1);
    }
}
