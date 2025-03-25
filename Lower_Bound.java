class Lower_Bound{
    public static int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int ans=nums.length;

        while (start<=end) {
            int mid=start+(end-start)/2;
            if (nums[mid]>=target) { 
                ans=mid;
                end=mid-1;
            } 
            else {
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String []a){
        int nums[]={1,2,2,3,4};
        int k=2;
        int ans=searchInsert(nums,k);
        System.out.println(ans);
    }
}//Time Complexity:O(log n)