class Solution {
    public int getLeastFrequentDigit(int n) {
        String s = Integer.toString(n);
        int minFrequencia = Integer.MAX_VALUE;
        int lFreqnt = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char digito = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == digito) {
                    count++;
                }
            }
            int valorDigito = digito - '0';
            if (count < minFrequencia || (count == minFrequencia && valorDigito < lFreqnt)) {
                minFrequencia = count;
                lFreqnt = valorDigito;
            }
        }
        return lFreqnt;
    }
}