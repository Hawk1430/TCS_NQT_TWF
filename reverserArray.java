import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

public class reverserArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int i=0,j=n-1;
        while(i <= j){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int num:arr){
            System.err.print(num + " ");
        }
    }
}
