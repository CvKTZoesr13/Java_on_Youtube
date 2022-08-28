import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	};
	public void showMyWindow() {
		this.setSize(300, 500);
		this.setVisible(true);
	}
	
	public void showMyWindow(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
		m1.showMyWindow();
	}
}
