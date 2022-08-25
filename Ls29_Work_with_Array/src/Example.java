import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		// kiểu nguyên thủy
		int[] arr1 = new int[] { 1, 3, 4 };
		// copy mảng
		int[] arr2;
		arr2 = arr1.clone();
		arr2[0] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		// arraycopy
		int arr3[] = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		arr3[2] = 129;
		System.out.println(Arrays.toString(arr3));
	}
}
