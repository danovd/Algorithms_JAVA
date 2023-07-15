import java.util.Arrays;

public class Selection_Sort_Optimized {

	public static void main(String[] args) {
	int arr [] = {8,1,2,3,4,-3};
	arr = sortNumbers(arr);
System.out.println(Arrays.toString(arr));
	}

	
	public static int [] sortNumbers (int arr []){
		int start = 0;
		int end =  (arr.length-1);
		for(byte sort = 0; sort < arr.length/2; sort++){
			
			int maxIndex = start; 
			int minIndex = start;
			
			for(int index = start; index <= end; index++){
				
				if(arr[index]>arr[maxIndex]){maxIndex = index;}
				if(arr[index]<arr[minIndex]){minIndex = index;}
			}
		
			int element = arr[maxIndex];
				arr[maxIndex]=arr[end];
				arr[end]=element;
			
				if(minIndex == end){minIndex = maxIndex;}	
			
			element = arr[minIndex];
			arr[minIndex]=arr[start];
			arr[start]=element;
		
			end--;
			start++;
		}
		return arr;
	}
	
	
}
