class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        // caliculating the frequencies
        Map<String, Integer> frequency = new HashMap<>();
        for (int i =0; i < t.length(); i++) {
            if (frequency.containsKey(String.valueOf(t.charAt(i)))) {
                frequency.put(String.valueOf(t.charAt(i)), frequency.get(String.valueOf(t.charAt(i))) + 1);
            } else {
                frequency.put(String.valueOf(t.charAt(i)), 1);
            }
        }

        for( int i = 0; i<s.length(); i++) {
            if (!frequency.containsKey(String.valueOf(s.charAt(i))) || frequency.get(String.valueOf(s.charAt(i))) == 0) {
                return false;
            } else {
                frequency.put(String.valueOf(s.charAt(i)), frequency.get(String.valueOf(s.charAt(i))) - 1);
            }
        }

        return true;
    }
}