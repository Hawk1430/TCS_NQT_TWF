import java.util.HashMap;
import java.util.Map;

public class symmetricPair {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int first = arr[i][0];
            int second = arr[i][1];
            if(hmap.containsKey(second) && hmap.get(second)== first){
                System.out.println("(" + first + ", "+ second +") ,(" + second + ", "+ first +") ");
            }
            else{
                hmap.put(first, second);
            }
        }
    }
}
