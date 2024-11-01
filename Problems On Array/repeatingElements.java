import java.util.LinkedHashMap;

public class repeatingElements {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,5};
        LinkedHashMap<Integer,Integer> lhmap = new LinkedHashMap<>();
        for(int num: arr){
            lhmap.put(num,lhmap.getOrDefault(num, 0) +1);
        }
        for(Integer key:lhmap.keySet()){
            if(lhmap.get(key) > 1){
                System.out.print(key+ "  ");
            }
        }


    }
}
