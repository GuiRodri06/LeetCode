class Solution {
    public boolean checkRecord(String s) {
        int contA = 0;
        int contL = 0;

        char[] l = s.toCharArray();
        for (int i = 0; i < l.length; i++) {

            if (l[i] == 'A') {
                contA++;
                if (contA == 2) {
                    return false;
                }
            }

            if (l[i] == 'L') {
                contL++;
                if (contL == 3) {
                    return false;
                }
            } else {
                contL = 0; 
            }

        }
        return true;
    }
}