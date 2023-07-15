import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		int arr [] = {-8,1,2,-9,3,4,7,5,6,7,0};	
		arr = sort(arr);
		System.out.println(Arrays.toString(arr));
		
		}
		
		/// bubble sort
		private static int [] sort (int [] arr){
			int end = arr.length;
			int element = 0;
			int count = 0;
			
			for(byte row = 0; row < end; row++){		///optimization: row<end; (end--);

				boolean isFin = true;			/// frag for stop the loop if finish sorting 

				for(byte col = 0; col<end-1; col++){
					if(arr[col]>arr[col+1]){
				element = arr[col];
				arr[col] = arr[col+1];
				arr[col+1]=element;
					isFin = false;
					}
				}
				count++;end--;
		if(isFin==true){break;}
			}
			System.out.println("Iterations of main loop before finish: " + count);
		return arr;	
		}

}
