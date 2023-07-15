
public class Counting_sort {

	public static void main(String[] args) {
	int[] a = {1, 1, -2, 7};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int index=0; index < a.length; index++) {
			if (a[index] > max) {
				max = a[index];
			}
			if (a[index] < min) {
				min = a[index];
			}
		}
		
		if (min < 0) {
			min *= -1;
		}
		
		int[] count = new int[min+max+1];
		
		for (int index=0; index < a.length; index++) {
			int value = a[index] + min;
			count[value]++;
		}
		for (int value=0; value <= max + min; value++) {
			while (count[value] > 0) {
				System.out.print((value-min) + " ");
				count[value]--;
			}
		}
	}
}
