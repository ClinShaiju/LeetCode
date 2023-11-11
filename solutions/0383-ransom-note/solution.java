class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> mag = new HashMap();
        for (int i = 0; i < magazine.length(); i++) {
            String currentLetter = magazine.substring(i, i+1);
            if (mag.containsKey(currentLetter)) mag.put(currentLetter, mag.get(currentLetter)+1);
            else mag.put(currentLetter, 1);
        }
        while (ransomNote.length() != 0) {
            String currentLetter = ransomNote.substring(0, 1);
            if (mag.containsKey(currentLetter)) {
                mag.put(currentLetter, mag.get(currentLetter) - 1);
                if (mag.get(currentLetter) == 0) mag.remove(currentLetter);
                ransomNote = ransomNote.substring(1);
            }
            else return false;
        }
        return true;
    }
}
