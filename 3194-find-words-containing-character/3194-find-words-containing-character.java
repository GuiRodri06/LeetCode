class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            char[] l = words[i].toCharArray();
            for (int j = 0; j < l.length; j++) {
                if (l[j] == x) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}