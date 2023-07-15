import java.util.Arrays;

public class PARTITION_quick_sort {
public static void main(String[] args) {
	int arr [] = {7,9,3,5,2,6,2,1,1,1,3,6,0,9,3,7,2};
	int k = f(arr);
	System.out.println(k);		//rerurn how many elements are lower than choosen (begin from 0!)
	System.out.println(Arrays.toString(arr));
	
}

static int f (int [] arr){
	int x = arr[arr.length-1];
	int k = -1;
	
	for(int index = 0; index < arr.length-1; index++){
		if(arr[index] <= x){
			k++;
			
			int element = arr[index];
			arr[index] = arr[k];
			arr[k] = element;
		}
	}
	
	return k;
	}
}
