class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2]; 
        for (int i=0; i<=0; i++) {
            ans[i] = celsius + 273.15;
            ans[i+1] = celsius * 1.80 + 32.00;
        }       
        return ans;
    }
}