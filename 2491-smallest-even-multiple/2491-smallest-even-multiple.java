class Solution {
    public int smallestEvenMultiple(int n) {
        return (n * 2) / mdc(n, 2);
    }

    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}