import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr [] = {7,9,3,5,2,6,2,1,1,1,3,6,0,9,3,7,2,6};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
static void quickSort (int [] arr, int l, int r){
	if(l>=r){
		return;
	}
	int k = partition(arr, l, r);
	quickSort(arr, l, k-1);
	quickSort(arr, k+1, r);
}
	static int partition (int [] arr, int l, int r){
		int x = arr[r];
		int k = l-1;
		
		for(int index = l; index <= r; index++){
			if(arr[index] <= x){
				k++;
				
				int element = arr[index];
				arr[index] = arr[k];
				arr[k] = element;
			}
			
		}
		System.out.println(k);
		return k;
		}
	}
