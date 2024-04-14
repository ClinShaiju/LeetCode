class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : jewels.toCharArray()) for (char cc : stones.toCharArray()) if (c == cc) count++;
        return count;
    }
}
