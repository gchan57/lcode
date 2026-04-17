class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int v=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                arr1[i]=1;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]==2){
                arr2[j]=1;
            }
        }
        for(int i=0;i<n;i++){
            if (arr1[i] != 1) continue;
            for(int j=0;j<n;j++){
                if (arr2[j] != 1) continue;
                if((arr1[i]==1)&&(arr2[j]==1)){
                if(Math.abs(i-j)<v){
                    v=Math.abs(i-j);
                }
            }}
        }
        return (v == Integer.MAX_VALUE) ? -1 : v;
    }
}