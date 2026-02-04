class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new  int[n*2];
       int x=0;
       int y=n;
       int i=0;
       for (int k = 0; k < n; k++) {
            arr[i++] = nums[x++];
            arr[i++] = nums[y++];
        }

        return arr;
    }
}