
public class BinarySort {

	public static void main(String[] args) {
		//при задаване на масив направо го създаваме 
		System.out.println(binarySearch(new int [] {3,5,8,9,12,14,16,23,34,45,48,53,56,67,78}, 14));
	
	}
static int binarySearch(int arr[], int x){
	int left = 0;
	int right = arr.length - 1;
	
	while(left <= right){
		int midle = (left + right)/2;
		if(arr[midle] == x){
			return midle;
		}
		if(arr[midle] > x){
			right = midle -1;
		}
		if(arr[midle] < x){
			left = midle + 1;
		}
	}
	return -1;
}
	
	
	
}
