package TwoPointers;

public class RemoveElement {
    static int removeDuplicates(int[] arr,int value) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int left = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=value){
                arr[i] = arr[left];
                left++;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,5,5};
        int value = 2;
        System.out.println(removeDuplicates(arr,value));
    }
}
