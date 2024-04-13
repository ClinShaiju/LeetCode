class Solution {
    public boolean isIsomorphic(String s, String t) {
        TreeMap<Character, Character> map = new TreeMap<>();
        TreeMap<Character, Character> map2 = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character current = map.put(s.charAt(i), map.getOrDefault(s.charAt(i), t.charAt(i)));
            Character current2 = map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), s.charAt(i)));
            if (!(current == null || current == t.charAt(i))) return false;
            if (!(current2 == null || current2 == s.charAt(i))) return false;
        }
        return true;
    }
}
