public class rotateArray {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {1, 2, 3, 4, 5};
        int k=2;
        int r = k%a.length;

        int arr[] = new int[a.length];
        int l=k;
        int i=0;
        while(l<a.length){
            arr[i] = a[l];
            i++;
            l++;
        }
        int j=0;
        while(j<r){
            arr[i] = a[j];
            i++;
            j++;
        }

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
