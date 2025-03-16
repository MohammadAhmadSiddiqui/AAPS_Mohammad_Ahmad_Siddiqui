public class triplet {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,3};
        int target=10;
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        flag=true;
                        System.out.println("Triplet available at index:"+i+","+j+","+k);
                        break;
                    }
                }
            } 
        }
        if(flag){
            System.out.println("Triplet is available");
        }
        else{
            System.out.println("Triplet not available");
        }
    }    
}
//Time Complexity:O(n^3)