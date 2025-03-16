import java.util.Arrays;
public class triplet_optimized {
    
    static void findTriplets(int[] arr, int target) {
        Arrays.sort(arr); 
        int n = arr.length;

        for (int i=0;i<n-2;i++) { 
            int left=i+1,right=n-1; 

            while (left<right) {
                int sum=arr[i]+arr[left]+arr[right];

                if (sum == target) { 
                    System.out.println("(" + arr[i] + ", " + arr[left] + ", " + arr[right] + ")");
                    left++; 
                    right--; 
                } else if (sum<target) { 
                    left++; 
                } else { 
                    right--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10, 12};
        int target = 22;
        findTriplets(arr, target);
    }
}

