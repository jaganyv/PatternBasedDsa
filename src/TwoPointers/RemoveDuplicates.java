package TwoPointers;

public class RemoveDuplicates {
    static int removeDuplicates(int[] arr) {
        if(arr.length==0) return 0;
        int i = 1;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[j-1]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
