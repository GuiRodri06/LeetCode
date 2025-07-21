class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employeesTarget = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                employeesTarget += 1;
            }
        }
        return employeesTarget;
    }
}