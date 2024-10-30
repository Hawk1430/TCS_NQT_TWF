public class quickSort{
    public static void main(String[] args) {
        int [] arr = {2,5,1,34,7,9,6};
        quicksort(arr, 0,     arr.length-1);

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
    private static void quicksort(int[] arr, int si, int ei){
        if(si >=ei){
            return;
        }

        int pivot = partition(arr, si, ei);

        quicksort(arr, 0, pivot-1);
        quicksort(arr, pivot+1, ei);

    }
    private static int partition(int[] arr, int si, int ei) {
        int count=0;
        for(int i=si+1; i<=ei; i++){
            if(arr[i]<arr[si]) count++;
        }

        int pivot = si + count;
        swap(arr[si], arr[pivot]);

        int k= si;
        int j= ei;

        while(k<pivot && j>pivot){
            if(arr[k] > arr[pivot] && arr[j] < arr[pivot]){
                swap(arr[k], arr[j]);
                k++;
                j--;
            }
            else if(arr[k] < arr[pivot]) k++;
            else if(arr[j] > arr[pivot]) j--;
        }
        return pivot;
    }
    private static void swap(int i, int j) {
        int temp = i;
        i=j;
        j=temp;
    }
}