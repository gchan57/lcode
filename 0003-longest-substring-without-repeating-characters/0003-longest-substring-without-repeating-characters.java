class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int res=0;
        boolean[] track=new boolean[128];
        while(right<s.length()){
            while(track[s.charAt(right)]==true){
                track[s.charAt(left)]=false;
                left++;
            }
            track[s.charAt(right)]=true;
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}