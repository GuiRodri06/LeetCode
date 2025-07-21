class Solution {
    public int numIdenticalPairs(int[] nums) {
        int evenNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    evenNumbers += 1;
                }
            }
        }
        return evenNumbers;    
    }
}