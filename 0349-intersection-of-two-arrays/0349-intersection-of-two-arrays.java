class Solution {
      public boolean bsearch(int[] arr,int target){
       int l=0;
       int h=arr.length-1;
       while(l<=h){
        int m=l+(h-l)/2;
        if(arr[m]==target) return true;
        if(target>arr[m]){
            l=m+1;
        }
        else{
            h=m-1;
        }
       }
       return false;
       }
    public int[] intersection(int[] nums1, int[] nums2) {  
        Set<Integer> set= new HashSet<>();
        int n1l=nums1.length;
        int n2l=nums2.length;
        if(n1l<n2l){
        Arrays.sort(nums2);
        for(Integer num : nums1){
            if(bsearch(nums2,num)){
                set.add(num);
            }
        }
    }
    else{
       Arrays.sort(nums1);
        for(Integer num : nums2){
            if(bsearch(nums1,num)){
                set.add(num);
            }
        }
    }
    int i=0;
    int[] res=new int[set.size()];
    for(Integer num:set){
        res[i++]=num;
    }
    return res;
    }
}