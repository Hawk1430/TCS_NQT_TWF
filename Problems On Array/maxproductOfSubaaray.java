public class maxproductOfSubaaray {
    // Kadane's Algorithm
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4,-5};
        int prod1 = arr[0];
        int prod2 = arr[0];
        int maxProd = arr[0];
        for(int i=1;i<arr.length;i++){
            int temp = Math.max(arr[i], Math.max(prod1*arr[i],prod2*arr[i]));
            prod2 = Math.min(arr[i], Math.min(prod1*arr[i], prod2*arr[i]));
            prod1 = temp;
            
            maxProd = Math.max(maxProd, prod1);
            
        }
        System.out.println(maxProd);
    }
}
