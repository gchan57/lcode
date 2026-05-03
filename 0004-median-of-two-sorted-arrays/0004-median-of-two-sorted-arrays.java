class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        if(m>n) return findMedianSortedArrays(nums2,nums1);
        int l=0;
        int h=m;
        while(l<=h){
            int m1=(l+h)/2;
            int m2=(m+n+1)/2 -m1;
            int l1= (m1==0)? Integer.MIN_VALUE : nums1[m1-1] ;
            int r1= (m1==m)? Integer.MAX_VALUE: nums1[m1] ;
            int l2= (m2==0)? Integer.MIN_VALUE:nums2[m2-1] ;
            int r2= (m2==n)? Integer.MAX_VALUE: nums2[m2];

            if(l1<=r2 && l2<=r1){
                if((m+n)%2==0) return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;

                else {
                  return  Math.max(l1,l2);
                }
            }
            if(l1>r2) h=m1-1;
            else l=m1+1;
        }
        return 0;
    }
}