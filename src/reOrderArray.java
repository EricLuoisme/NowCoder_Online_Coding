public class reOrderArray {
    public void reOrderArray_ha(int [] array) {
        String odd = "";
        String even = "";

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) // even
                even += "" + array[i];
            else
                odd += "" + array[i];
        }

        String new_order = odd + even;
        System.out.println(new_order);
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(new_order.substring(i, i+1));
        }
    }

    public static void main(String[] args) {
        reOrderArray re = new reOrderArray();
        int[] test = new int[]{1, 6, 5, 3, 8, 2};
        re.reOrderArray_ha(test);
    }
}
