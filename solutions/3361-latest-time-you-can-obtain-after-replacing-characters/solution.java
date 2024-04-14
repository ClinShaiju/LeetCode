class Solution {
    public String findLatestTime(String s) {
        while (s.indexOf("?") != -1) {
            int index = s.indexOf("?");
            if (index==0) {
                if (s.charAt(1) != '?' && Integer.parseInt(s.charAt(1)+"") > 1){
                    s = s.substring(0, index) + "0" + s.substring(index+1);
                    continue;
                }
                s = s.substring(0, index) + "1" + s.substring(index+1);
                continue;
            }
            
            if (index==1) {
                if (s.charAt(0) == '0')
                {
                    s = s.substring(0, index) + "9" + s.substring(index+1);
                    continue;
                } else {
                    s = s.substring(0, index) + "1" + s.substring(index+1);
                    continue;
                }
                
            }
            if (index==3) {
                s = s.substring(0, index) + "5" + s.substring(index+1);
                continue;
            }
            if (index==4) {
                s = s.substring(0, index) + "9" + s.substring(index+1);
                continue;
            }
    
        }
        return s;
    }
}
