
import java.util.LinkedHashMap;
import java.util.Scanner;

public class countFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        LinkedHashMap<Integer,Integer> hmap = new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            int temp = hmap.getOrDefault(arr[i] ,0);
            hmap.put(arr[i],temp+1);
        }

        for(Integer key:hmap.keySet()){
            System.out.println(key+": "+hmap.get(key ) );
        }
        sc.close();
    }
}
