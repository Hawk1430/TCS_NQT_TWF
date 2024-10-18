public class rotateElementbyKtime {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 2;
        String dir = "right";
        if(dir.equals("right")){
            rotater(arr, n-k, n-1);
            rotater(arr, 0, n-k-1);
            rotater(arr, 0, n-1);
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
        
    }

    public static void rotater(int[] arr,int start,int end){
        int i=start;
        int j=end;
        while (i<=j) {
            // arr[i] = arr[i] ^ arr[j];
            // arr[j] = arr[i] ^ arr[j];
            // arr[i] = arr[i] ^ arr[j];
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    
}
