class Solution {
    public String mergeAlternately(String word1, String word2) {
        int firstPointer = 0;
        int secondPointer = 0;
        StringBuilder output = new StringBuilder();
        while (firstPointer < word1.length() || secondPointer < word2.length()) {
            if (!(firstPointer >= word1.length())) {
                output.append(word1.charAt(firstPointer));
                firstPointer++;
            }
            if (!(secondPointer >= word2.length())) {
                output.append(word2.charAt(secondPointer));
                secondPointer++;
            }
        }
        return output.toString();
    }
}
