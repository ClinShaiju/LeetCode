class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        sum+=t.charAt(t.length()-1);
        for (int i = 0; i < s.length(); i++) sum+=t.charAt(i) - s.charAt(i);
        return (char)(sum);
    }
}
