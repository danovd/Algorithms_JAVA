import java.util.Arrays;

public class CS {

	
		public static void main(String[] args) {
			
			int[] result = countingSort(new int[]{3, 1, 1, 2,
					1, 3, 2, 3, 2, 6, 1});
					System.out.println(Arrays.toString(result));
		}
		
		public static int[] countingSort(int nums[]) {
			
			int maxNum = nums[0];
			for(int i = 1; i< nums.length; i++) {
			if(maxNum < nums[i]) {
			maxNum = nums[i];
			}
			}
			
			int numbersCount[] = new int[maxNum+1];
		
			int result[] = new int[nums.length];
			
			for (int index=0; index < nums.length; index++) {
			
			
			numbersCount[nums[index]]++;
			}
			
			for (int index=1; index < numbersCount.length;
			index++) {
			numbersCount[index] += numbersCount[index-1];
			}
			
			for (int index=0; index < nums.length; index++) {
			
			numbersCount[nums[index]]--;
			result[numbersCount[nums[index]]] = nums[index];
			}
			return result;
			}	
}
