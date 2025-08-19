class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums.length == 1) {
                break;
            } else if ((nums[i] + nums[i-1]) % 2 != 0) {
                
            } else {
                return false;
            }
        }
        return true;
    }
}