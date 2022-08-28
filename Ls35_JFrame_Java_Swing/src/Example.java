import javax.swing.JFrame;

public class Example {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(600, 400);
		jf.setTitle("Jframe");
		// Gán vị trí hiển thị mặc định
		
		jf.setLocation(300, 300);
		// Thoát ra khỏi chương trình khi đóng cửa sổ jFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// cho phép hiển thị
		jf.setVisible(true);
	}
}
