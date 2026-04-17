class Solution {
    public int[][] merge(int[][] arr) {
        int n= arr.length;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> res =new ArrayList<>();

        for(int i=0;i<n;i++){
            int start = arr[i][0];
            int end=arr[i][1];
            if(!res.isEmpty()&&res.get(res.size()-1)[1]>=end){
                continue;
            }
        for(int j=i+1;j<n;j++){
            if(arr[j][0]<=end){
                end=Math.max(arr[j][1],end);
            }
           
        }
         res.add(new int[]{start,end});
        }
        int[][] result=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
     return result;
    }
}