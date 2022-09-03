public class PythTriplets {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        System.out.println(isexists(arr, arr.length));
    }
    static boolean isexists(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                for(int k=0;k<n;k++){
                    if(k==i || k==j){
                        continue;
                    }
                    int a = arr[i]*arr[i];
                    int b = arr[j]*arr[j];
                    int c = arr[k]*arr[k];
                    if(a+b==c){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
