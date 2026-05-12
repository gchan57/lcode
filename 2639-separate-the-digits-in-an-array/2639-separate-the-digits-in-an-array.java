class Solution {

    public void convertor(int ele,ArrayList<Integer> list){
         ArrayList<Integer> temp=new ArrayList();
      while(ele>0){
          int app=ele%10;
          temp.add(app);
          ele=ele/10;
      }
      Collections.reverse(temp);
      list.addAll(temp);
    }

    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList();
        for(int i=0;i<nums.length;i++){
           convertor(nums[i],list);
        }
        int[] arr=list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}