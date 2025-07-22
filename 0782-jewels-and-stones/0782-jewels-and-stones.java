class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] stonesArray = stones.toCharArray();
        char[] jewelsArray = jewels.toCharArray();
        for (char c : stonesArray) {
            for (char d : jewelsArray) {
                if ( d == c) {
                    count++;
                }
            }
        }
        return count;
    }
}