class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        int n=nums.length;
        int lb=n;
        int ub=n;
        int l=0;
        int h=n-1;
         if(n==0){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]>=target){
                lb=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        l=0;
        h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]>target){
                ub=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        if(lb==n||((nums[lb])!=target)){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        arr[0]=lb;
        arr[1]=ub-1;
        return arr;
    }
}