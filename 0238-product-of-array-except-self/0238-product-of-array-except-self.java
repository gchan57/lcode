class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zero=0;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                prod*=nums[i];
            }
            else{
                zero++;
                idx=i;
            }
        }
        int[] res=new int[nums.length];
        Arrays.fill(res,0);
        if(zero==0){
            for(int i=0;i<nums.length;i++){
                res[i]=prod/nums[i];
            }
        }
        else if(zero==1){
            res[idx]=prod;
        }
        return res;
    }
}