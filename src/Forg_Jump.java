public class Forg_Jump {
    public int JumpFloor(int target) {
        if (target <= 2)
            return target;

        int pre_1 = 1;
        int pre_2 = 2;

        for (int i = 3; i <= target; i++){
            int cur = pre_2 + pre_1;
            pre_2 = pre_1;
            pre_1 = cur;
        }
        return pre_1;
    }
}
