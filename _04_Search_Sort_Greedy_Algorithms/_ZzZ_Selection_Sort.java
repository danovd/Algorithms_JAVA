import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		int arr [] = {20,6,1,9,3,-2,-5,2,5,10,-12,-3,-90};
	arr = sort(arr);
	System.out.println(Arrays.toString(arr));
	}
private static int [] sort(int[]arr){
	for(byte row = 0; row < arr.length; row++){
	int maxIndex = 0;
		for(byte col = 0; col < arr.length-row; col++){
			if(arr[col]>arr[maxIndex]){maxIndex=col;}
	}
	int element = arr[maxIndex];
	arr[maxIndex]=arr[arr.length-row-1];
	arr[arr.length-row-1]=element;
	}
	return arr;
}
}
