class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int t=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if((1==nums[i])){
                temp++;
                continue;
            }
            if(temp>t)
            t=temp;
            temp=0;
        }
    if(temp>t)
            t=temp;
    return t;}
}