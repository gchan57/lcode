class Solution {
    public int firstMatchingIndex(String s) {
        int l=s.length();
        char[] carr=s.toCharArray();
        for(int i=0;i<(l/2);i++){
            if(carr[i]==carr[l-i-1]){
                return i;
            }
        }
        if(l%2!=0){
            return (l/2);
        }
        return -1;
    }
}