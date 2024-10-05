import java.util.*;
public class replaceArrayWithRank {
    public static void main(String[] args) {
        int  [] dummy = {20,15,26,2,98,6};
        int [] arr = {20,15,26,2,98,6};
        Arrays.sort(arr);
        Map<Integer,Integer> hmap = new HashMap<>();
        int temp=1;
        for(int num:arr){
            if(!hmap.containsKey(num)){
                hmap.put(num, temp);
                temp++;
            }
        }
        for(int num: dummy){
            System.out.print(hmap.get(num) + " ");
        }
    }
}
