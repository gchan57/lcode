class Solution {
    public int triangleNumber(int[] arr) {
        Arrays.sort(arr);
        int count =0;
        for(int i=2;i<arr.length;i++){
            int left=0;
            int right=i-1;
           while(left<right){
            int sum=arr[left]+arr[right];
            if(sum>arr[i]){
                count+=right-left;
                right--;
            }
            else{
                left++;
            }
           }
        }
        return count;
    }
}