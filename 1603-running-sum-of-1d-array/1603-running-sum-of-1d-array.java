class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            if (i == 0) sum[i] = nums[i];
            else sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
}