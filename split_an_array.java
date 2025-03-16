import java.util.Arrays;
class split_an_array {
    public static boolean canPartition(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<i;j++){
                leftsum=leftsum+nums[j];
            }
            for(int k=i;k<n;k++){
                rightsum=rightsum+nums[k];

            }
            if(rightsum==leftsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,3,2,1};
        if(canPartition(nums)){
            System.out.println("Array can Split");
        }
        else{
            System.out.println("Array can't be split");
        }
    }
}//Time Complexity:O(n^2)
