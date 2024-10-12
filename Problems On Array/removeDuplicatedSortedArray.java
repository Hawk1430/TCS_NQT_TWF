import java.util.Scanner;

public class removeDuplicatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j=1;
        while(i<n && j<n){
            if(arr[i] == arr[j] ){
                j++;
            }
            else if(arr[i] != arr[j]){
                i++;
                swap(arr, i,j);
                j++;
            }
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
    public static void swap(int[] arr,int i,int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }
}
