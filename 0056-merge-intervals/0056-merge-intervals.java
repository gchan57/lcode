class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        res.add(new int[] {arr[0][0],arr[0][1]});

        for(int i=0;i<arr.length;i++){
            int[] last=res.get(res.size()-1);
            int[] curr=arr[i];
            if(curr[0]<=last[1]){
                last[1]=Math.max(last[1],curr[1]);
            }
            else
                res.add(new int[]{curr[0],curr[1]});
        }
        int[][] result=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
}