class Solution {
    public int countDigits(int num) {

        int count = 0;
        String numeroStr = Integer.toString(num);
        int[] var = new int[numeroStr.length()];
        for (int i = 0; i < numeroStr.length(); i++) {
            var[i] = Character.getNumericValue(numeroStr.charAt(i));
            if (num % var[i] == 0) {
                count++;
            }
        }
        return count;
    }
}