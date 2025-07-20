class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x = 0;
        for(int i = 0; i < t; i++) {
            num = num + 1;
            x = num + t;
        }
        return x;
    }
}