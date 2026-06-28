class Solution {
    public int pivotIndex(int[] nums) {
        int prefix=0;
        int suffix=0;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        for(int i=0;i<nums.length;i++){
            suffix=total-prefix-nums[i];
            if(prefix==suffix){
                return i;
            }
            prefix+=nums[i];
        }
        return -1;
    }
}