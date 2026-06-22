class Solution {
    public int trap(int[] height) {
       int left=0;
       int right=height.length-1;
       int lmax=height[0];
       int rmax=height[height.length-1];
       int res=0;
       while(left<right){
        if(lmax<=rmax){
                left++;
                lmax=Math.max(lmax,height[left]);
                res+=lmax-height[left];
        }
        else{
                right--;
                rmax=Math.max(rmax,height[right]);
                res+=rmax-height[right];
        }
       }
       return res; 
    }
}