class Solution {
  public void construct(String pattern, int[] lps) {
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }}}
      

    public boolean rotateString(String txt, String rot) {
        if (txt.length() != rot.length()) return false;
        
        String searchSpace = txt + txt;
        int n = searchSpace.length();
        int m = rot.length();
        
        int[] lps = new int[m];
        construct(rot, lps);

        int i = 0;
        int j = 0;
        while (i < n) {
            if (searchSpace.charAt(i) == rot.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                return true;
            } else if (i < n && searchSpace.charAt(i) != rot.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }}
        