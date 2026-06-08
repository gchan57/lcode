class Solution {
    public int[] twoSum(int[] arr, int target) {
         int left=0;
        int right=arr.length-1;
        int sum=0;
        int count=0;
        int[] arrr= new int[2];
        while(left<right){
            sum=arr[left]+arr[right];
            if(sum>target){
                right--;
            }
            if(sum<target){
                left++;
            }
            if(sum==target){
                int e1=arr[left];
                int e2=arr[right];
                
        arrr[0]=left+1;
        arrr[1]=right+1;
        break;
            }
        
        
    }
    return arrr ;
}}