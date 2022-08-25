package timkiemchuoi;

public class viDuTimChuoi {
	public static void main(String[] args) {
		String s1 = "Hello world and everyone, everything!";
		String s2 = "Hello world";
		char s3 = 'e';
		// indexOf => nếu như không tìm thấy chuỗi cần tìm trong chuỗi khác, return một giá trị âm
		// indexOf thường sẽ nhận vào 2 tham số, tham số thứ nhất là đối số kiểu chuỗi hoặc kiểu ký tự
		// Tham số thứ 2 là vị trí bắt đầu tìm kiếm trong chuỗi, nếu không truyền, mặc định sẽ là 0.
		// tìm kiếm từ trái sang phải
		System.out.println("Vị trí bắt đầu của chuỗi s2 trong s1 là: " + s1.indexOf(s2));
		System.out.println("Vị trí bắt đầu của chuỗi s2 bắt đầu từ vị trí thứ 2 trong s1 là: " + s1.indexOf(s2, 2));
		System.out.println("Tìm ký tự s trong s1: " + s1.indexOf(s3));
		// lastIndexOf => tìm kiếm từ phải qua trái
		System.out.println("Tìm ký tự s trong s1 từ phải qua trái: " + s1.lastIndexOf(s3));
	}
}
