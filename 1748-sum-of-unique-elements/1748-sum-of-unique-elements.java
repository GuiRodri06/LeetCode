import java.util.ArrayList;
import java.util.List;

class Solution {
    public int sumOfUnique(int[] nums) {
        List<Integer> n = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == digit) {
                    count++;
                }
            }
            if (count == 1) {
                n.add(digit);
            }
        }
        int sum = 0;
        for (int numbers : n) {
            sum += numbers; // ou sum = sum + numero;
        }
        return sum;
    }
}