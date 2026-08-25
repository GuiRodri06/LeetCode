import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int countSegments(String s) {
        if (s.isBlank() || s == null || s.length() == 0 ) return 0;
        List<String> words = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        int count = 0;
        for(String word: words){
            count++;
        }
        return count;
    }
}