import java.util.Scanner;
import java.util.*;

public class medianofArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double median=0;
        if(n%2 == 0){
            int temp = arr[(n/2)-1] ;
            int temp2 = arr[n/2];
            median = (double)(temp+temp2)/2;
        }
        else{
            median = arr[n/2];
        }
        System.out.println(median);
        sc.close();
    }


}
