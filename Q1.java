import java.util.Scanner;

/**
 * temp
 */
public class Q1 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            max = Math.max(num, max);
        }
        System.out.println(max);


    }
    
}