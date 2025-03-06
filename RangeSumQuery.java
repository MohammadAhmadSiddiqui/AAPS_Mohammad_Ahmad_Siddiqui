import java.util.*;
public class RangeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int N = sc.nextInt();
        System.out.println("Enter number of Queries:");
        int Q = sc.nextInt();

        int[]arr=new int[N];
        System.out.println("Enter "+N+" number of elements of array");
        for (int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }

        int[] sum=new int[N + 1];
        for (int i=1;i<=N;i++) {
            sum[i] =sum[i-1]+arr[i-1];
        }
        for (int i=0;i<Q;i++) {
            System.out.println("Enter the left Index:");
            int l=sc.nextInt();
            System.out.println("Enter the Right Index:");
            int r=sc.nextInt();
            int s1=sum[r+1]-sum[l];
            System.out.print("Sum:" +s1);
            System.out.println();
        }
    }
}