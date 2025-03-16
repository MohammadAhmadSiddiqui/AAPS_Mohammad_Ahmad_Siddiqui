public class move_zeros {
    public static void main(String[] args) {
		int arr[]={4,3,2,0,0,5};
		int n=arr.length;
		int idx=0;
		for(int i=0;i<n;i++){
		    if(arr[i]!=0){
		        arr[idx]=arr[i];
		        idx++;
		    }
		}
		while(idx<n){
		    arr[idx]=0;
		    idx++;
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
