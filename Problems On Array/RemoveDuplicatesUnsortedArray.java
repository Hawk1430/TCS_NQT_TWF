import java.util.*;

public class RemoveDuplicatesUnsortedArray {
    public static void main(String[] args) {
        int [] arr= {2,3,1,9,3,1,3,9};
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hmap.containsKey(arr[i])){
                System.out.print(arr[i]+ " ");
                hmap.put(arr[i],1);
            }
            
        }
    }
}
