import java.util.*;
import java.util.Collections;

class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
    Pair(){}
}

public class sortingArrayOnBasisOfFrequency {
    public static void main(String[] args) {
        int arr[] = {3, 3, 5, 2,2, 1, 1, 2};

        Map<Integer,Integer> hmap = new HashMap<>();
        for(int num:arr){
            hmap.put(num, hmap.getOrDefault(num,0)+ 1);
        }

        List<Pair> al = new ArrayList<>();

        for(Integer key: hmap.keySet()){
            al.add(new Pair(key,hmap.get(key)));
        }

        Collections.sort(al , (a,b)->{
            if(a.second == b.second){
                return a.first - b.first;
            }
            else{
                return b.second - a.second;
            }
        });

        for(Pair p: al){
            int temp = p.second;
            while(temp >0){
                System.out.print(p.first + " ");
                temp--;
            }
            System.out.print(", ");
        }

    }
}
