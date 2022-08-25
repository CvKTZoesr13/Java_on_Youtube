import java.util.Arrays;
import java.util.HashSet;

public class twoWay_Array_2 {
	public static void main(String[] args) {
		int[] arrInt1 = new int[] {1, 2,3};
		int[] arrInt2 = {4,5,6};
		
		// ghép 2 mảng một chiều thành một mảng hai chiều
		int [][] arrInt = {arrInt1, arrInt2};
		
		for (int[] row : arrInt) {
			for(int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		System.out.println("Or you can print like this: ");
		System.out.println(Arrays.deepToString(arrInt));
		
		// Hợp 2 mảng 1 chiều
		Integer[] ArrINT1 = Arrays.stream(arrInt1).boxed().toArray(Integer[]:: new)	;
		Integer[] ArrINT2 = Arrays.stream(arrInt2).boxed().toArray(Integer[]:: new)	;
		HashSet<Integer> set = new HashSet<>();
		set.addAll(Arrays.asList(ArrINT1));
		set.addAll(Arrays.asList(ArrINT2));
		System.out.println("Print the result after matching: ");
		System.out.println(set);
		
		// Chuyển về mảng
		Integer [] union = {};
		union = set.toArray(union);
		System.out.println("Print the new array after matching: ");
		System.out.println(Arrays.toString(union));
		
		// Giao 2 mảng một chiều
		ArrINT1 = new Integer[] {0,2,4,5,7,8,9,3,1};
		ArrINT2 = new Integer[] {1, 4, 5 ,10, 20};
		HashSet<Integer> set2 = new HashSet<>();
		set2.addAll(Arrays.asList(ArrINT1));
		set2.retainAll(Arrays.asList(ArrINT2));
		System.out.println("Print the new array after intersecting: ");
		System.out.println(set2);
	}
}
