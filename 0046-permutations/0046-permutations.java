class Solution {

    public void  permucomputee(int index,List<List<Integer>> result,int[] nums){

        if(index==nums.length){
            List<Integer> tempo=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                tempo.add(nums[i]);
            }
            result.add(new ArrayList<>(tempo));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(index,i,nums);
            permucomputee(index+1,result,nums);
            swap(index,i,nums);
        }
    }
    public void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        permucomputee(0,result,nums);
        return result;
    }
}