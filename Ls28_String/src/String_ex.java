import java.util.Scanner;

/*Trong Java chuỗi có ba thể hiện
	- String: bất biến
	- StringBuffer: khả biến, multi-thread
	- StringBuilder: khả biến, single-thread
- Đều là các đối tượng chứ không phải các mảng kí tự
- Được sử dụng phổ biến nhất là String.
- Ký tự trong java là ký tự trong bảng mã unicode hỗ trợ 16bit, không phải ASCII 8bit
- Các encoding(charset): các chế độ mã hóa ký tự nền được sử dụng trong hệ thống để chuyển đổi ký tự ASCII thành Unicode
VD: utf-8, utf-16.....

***CÁC PHƯƠNG THỨC THƯỜNG ĐƯỢC SỬ DỤNG VỚI CHUỖI KÝ TỰ***

-- Phương thức kiểm tra class String
	+ length(), charAt(), getChars(..), getBytes(..), hashCode()
-- Phương thức so sánh class String
	+ equals(...), equalsIgnoreCase(..), compareTo(...),
	+ compareToIgnoreCase(...), regionMatches(...), startsWith(...), endWith(...)
-- Phương thức chỉ mục class String
	+ indexOf(...), lastIndexOf(...)
-- Phương thức chuyển đổi class String
	+ subString(...), concat(...), replace(...), toLowerCase(...), toUpperCase(..), trim(), toCharArray(...), intern()*/
public class String_ex {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s = null;
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("------");
		// length() => return length of string
		System.out.println("Do dai chuoi vua nhap: " + s.length());
		// charAt() =>
		int len = s.length();
		for (int i = 0; i < len; i++) {
			System.out.println("Ky tu cua chuoi tai vi tri thu " + (i + 1) + " la: " + s.charAt(i));
		}
		
		// getChars (startPosition, endPosition, arrToSave, positionToSave)
		char[] arrChar = new char[100];
		
		s.getChars(1, 10, arrChar, 4);
		System.out.println(arrChar);
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println("arr["+ i+"]: "+ arrChar[i]);
		}
		// getBytes 
		byte[] arrBytes = s.getBytes();
		for (byte b : arrBytes) {
			System.out.println(b);
		}
		
		// so sánh chuỗi trong java
		// => sắp xếp
		// equals() => so sánh 2 chuỗi với nhau, nếu giống nhau => return true và ngược lại
		// equals() phân biệt chữ hoa chữ thường
		String s1 = "NGUYEN VAN A";
		String s2 = "nguyen van a";
		String s3 = "nguyen van a";
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s2 equals s3: " + s2.equals(s3));
		
		
		// equalsIgnoreCase() => không phân biệt chữ hoa chữ thường
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s2 equalsIgnoreCase s3: " + s2.equalsIgnoreCase(s3));
		
		// compareTo() => so sánh > < =, return giá trị là một số âm nếu chuỗi a.compareTo(b) a<b;
		// return giá trị là một số dương nếu chuỗi a.compareTo(b) a>b;
		// return giá trị là số 0 nếu chuỗi a.compareTo(b) a = b;
		String sv1 = "Nguyen van A";
		String sv2 = "Nguyen van B";
		String sv3 = "Nguyen van C";
		String sv4 = "Nguyen van A";

		System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
		System.out.println("sv3 compareTo sv1: "+sv3.compareTo(sv1));
		System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));
		
		// compareToIgnoreCase() không phân biệt chữ hoa chữ thường 
		
		// regionMatches => so sánh một đoạn
		String r1 = "Nguyen van a";
		String r2 = "van a";
		boolean check = r1.regionMatches(7, r2, 0, 5);
		System.out.println(check);
		
		// startsWith() => return boolean, kiểm tra chuỗi bắt đầu bằng...
		// endWith() => return boolean, kiểm tra chuỗi kết thúc bằng...
		
		}
}
