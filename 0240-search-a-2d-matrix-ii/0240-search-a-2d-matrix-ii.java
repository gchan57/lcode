class Solution {
 public boolean search(int[] mat,int x){
    int low=0,high=mat.length-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(mat[mid]==x)
            return true;
        else if(x>mat[mid])
            low=mid+1;
        else
            high=mid-1;
                }
            return false;
 }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            if(search(matrix[i],target))
                return true;
        }
    return false;
    }
}