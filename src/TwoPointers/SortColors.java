package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    static int[] sortColors(int[] nums) {
        int left = 0 , mid = 0,right = nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}
