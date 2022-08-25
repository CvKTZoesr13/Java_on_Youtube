package otherhandlewithstring;

public class Example {
	public static void main(String[] args) {

		// concat() => nối chuỗi
		String s1 = "Hello";
		String s2 = " world";
		String s3 = " everyone";

		System.out.println(s1.concat(s3));
		System.out.println(s1.concat(s2));

		// replace() => thay thế chuỗi
		String s5 = "Javascript";
		String s6 = s5.replaceAll(s5, "Java");
		System.out.println("s5: " + s5);
		System.out.println("s6: " + s6);
		// toLowerCase() => chuyển về chữ thường
		String s7 = s5.toLowerCase();
		System.out.println("s7: " + s7);
		// toUpperCase() => chuyển về chữ hoa
		String s8 = s5.toUpperCase();
		System.out.println("s8: "+ s8);
		// trim() => xóa khoảng trắng dư thừa ở đầu và cuối chuỗi
		String s9 = s5.trim();
		System.out.println("s9: "+ s9);
		
		
		/* subString() => cắt chuỗi con, nhận vào 2 tham số là vị trí bắt đầu cắt và vị trí kết thúc cắt, nếu 
		   chỉ truyền một giá trị, mặc định sẽ cắt từ vị trí bắt đầu đó đến hết chuỗi*/
		//
		String s10 = s5.substring(3);
		String s11 = s5.substring(1,4);
		System.out.println("s10: " +s10);
		System.out.println("s11: " +s11);
		}

}
