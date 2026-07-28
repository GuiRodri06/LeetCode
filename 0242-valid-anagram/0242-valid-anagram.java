class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> table = new HashMap<>();

        for (char letter : s.toCharArray()) {
            table.put(letter, table.getOrDefault(letter, 0) + 1);
        }

        for (char letter : t.toCharArray()) {

            if (!table.containsKey(letter)) {
                return false;
            }

            int qntAtual = table.get(letter);

            if (qntAtual == 1) {
                table.remove(letter);
            } else {
                table.put(letter, qntAtual - 1);
            }
        }

        return table.isEmpty();
    }
}