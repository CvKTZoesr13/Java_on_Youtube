import java.util.Arrays;
import java.util.stream.IntStream;

public class Example_Array_2 {
	public static void main(String[] args) {
		// Sinh ra ngẫu nhiên số phần tử mảng trong phạm vi [10, 20]

		int n = 10 + (int) (Math.random() * 10);

		// Khai báo mảng số nguyên int với n phần tử
		int[] arrInt = new int[n];
		int arrIntOther[];

		// Sinh ra ngẫu nhiên giá trị cho các phần tử mảng, giá trị trong phạm vi [0,
		// 100]
		for (int i = 0; i < n; i++) {
			arrInt[i] = (int) (Math.random() * 100);
		}

		// Sao chép mảng
		// arrIntOther = arrInt.clone();
		arrIntOther = Arrays.copyOf(arrInt, arrInt.length);

		//
		arrInt[4] = 1000;

		// In giá trị của mảng
		for (int value : arrIntOther) { // hỗ trợ từ phiên bản JDK 1.5 trở lên
			System.out.print(value + " ");
		}
		System.out.println();
		// Sắp xếp
		Arrays.sort(arrIntOther);

		System.out.println(Arrays.toString(arrIntOther));

		/*
		 * Từ version Java 8 hỗ trợ kỹ thuật sao chép từ một mảng nguyên thủy sang mảng
		 * đối tượng tương ứng
		 */

		Integer[] arrINT = Arrays.stream(arrInt).boxed().toArray(Integer[]::new);
		Integer[] arrINT1 = IntStream.of(arrInt).boxed().toArray(Integer[]::new);
		Integer[] arrINT2 = new Integer[arrInt.length];
		Arrays.setAll(arrINT2, i -> arrInt[i]);
		
		
		System.out.println("Auto-unboxing Object Array: ");
		for (int value : arrINT2) {
			System.out.print(value + " ");
		}
	}
}
