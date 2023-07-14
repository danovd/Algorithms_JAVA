package _04_Search_Sort_Greedy_Algorithms;

public class _01_Selection_Sort {
    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
