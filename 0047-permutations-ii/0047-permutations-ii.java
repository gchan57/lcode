class Solution {
    public void computu(List<List<Integer>> res,int[] nums,boolean[] used,List<Integer> list){

    if(list.size()==nums.length){
        res.add(new ArrayList<Integer>(list));
        return;
    }
    for(int i=0;i<nums.length;i++){
        if(used[i]) continue;
        if(i>0&&nums[i-1]==nums[i]&&!used[i-1]) continue;
        used[i]=true;
        list.add(nums[i]);
        computu(res,nums,used,list);
        used[i]=false;
        list.remove(list.size()-1);
    }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        List<Integer> list=new ArrayList<>();
        computu(res,nums,used,list);
        return res;
    }
}