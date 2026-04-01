class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> set=new HashSet<>();
        for(int i=1;i<arr.length;i++){
            int diff=arr[i]-arr[i-1];
            set.add(diff);
        }

        if(set.size()==1) return true;
        return false;
    }
}