class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
              int map[] = new int[128];
        for (char c: ransomNote.toCharArray()){
            int ind = magazine.indexOf(c, map[c]);
            if (ind == - 1) 
            {
            System.gc();
            return false;
            }
            else
                map[c] = ind + 1;

        }
        System.gc();
        return true;
    }
}
