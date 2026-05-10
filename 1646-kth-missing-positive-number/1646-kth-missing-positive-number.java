class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if((arr[m]-1-m)<k){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return l+k;
    }
}