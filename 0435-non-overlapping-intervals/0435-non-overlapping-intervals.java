class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int end=intervals[0][1];
        int c=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<end){
                c++;
            }
            else{
                end=intervals[i][1];
            }
        }
        return c-1;
    }
}