class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]>=minK)&&(nums[i]<=maxK)){
                count++;
            }
        }
        
        List<ArrayList<Integer>> saver=new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            
           if((nums[i]>=minK)&&(nums[i]<=maxK)){
                in.add(nums[i]);
            }
             else{
                 if(!in.isEmpty()){
                 saver.add(in);
                 in=new ArrayList<>();
                 }
             }
             
    }
        if(!in.isEmpty()){
            saver.add(in);
        }
        for(ArrayList<Integer> inside:saver ){
            long insidelen=inside.size();
            count+= (insidelen*(insidelen-1))/2;
        }
        return count;
}}