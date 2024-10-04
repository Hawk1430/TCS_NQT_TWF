
public class AddingElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 40;
        int idx = 3;
        int [] updatedArr= insert(arr, n, idx);
        for (int i : updatedArr) {
            System.out.print(i + " ");
        }
    }
    public static int[] insert(int[] arr,int val,int idx){
        int [] arr2 = new int[arr.length+1];
        boolean flag = false;
        for(int i=0;i<arr.length+1; i++){
            if(idx == i){
                flag= true;
                arr2[i] =  val;
            }
            else if(!flag){
                arr2[i] = arr[i];
            }
            else if(flag){
                arr2[i] = arr[i-1];
            }
        }
        return arr2;
    }
}
