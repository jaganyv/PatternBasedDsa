package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumII {
    static int[] twoSum2(int[] arr, int target) {
        int left = 0 , right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }else{
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element");
        int target = scanner.nextInt();
        int[] result = twoSum2(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
