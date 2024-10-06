import java.util.*;

public class equilibriumPointInArray {

    public static void main(String[] args) {
        int nums[] = { 2, 3, -1, 8, 4};
        int totalSum = 0;
        for (int n : nums) {
            totalSum += n;
        }
        int leftSum=0;
        int rightSum = totalSum;
        for(int i=0;i<nums.length;i++){
            rightSum -=  nums[i];
            if(leftSum == rightSum){
                System.out.println(i);
                return;
            }
            leftSum += nums[i];
        }
        System.out.println(-1);
    }
}