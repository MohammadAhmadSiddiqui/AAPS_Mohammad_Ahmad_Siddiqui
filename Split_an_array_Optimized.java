public class Split_an_array_Optimized {
    public static boolean canSplit(int arr[]) {
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false;
        }
        int leftSum = 0;
        int target = totalSum / 2;
        for (int i = 0; i < n; i++) {
            leftSum += arr[i];
            if (leftSum == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,3,2,1};
        if(canSplit(nums)){
            System.out.println("Array can Split");
        }
        else{
            System.out.println("Array can't be split");
        }
    }
}//Time Complexity:O(n)

