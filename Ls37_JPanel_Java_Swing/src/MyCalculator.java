import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My calculator");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JTextField jTextField = new JTextField(50);
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);

		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		JButton jButton_6 = new JButton("6");
		JButton jButton_7 = new JButton("7");
		JButton jButton_8 = new JButton("8");
		JButton jButton_9 = new JButton("9");
		JButton jButton_0 = new JButton("0");

		JButton jButton_Cong = new JButton("+");
		JButton jButton_Tru = new JButton("-");
		JButton jButton_Nhan = new JButton("*");
		JButton jButton_Chia = new JButton("/");
		JButton jButton_Bang = new JButton("=");
		JPanel jPanel_buttons = new JPanel();
		jPanel_buttons.setLayout(new GridLayout(3, 5));
		jPanel_buttons.add(jButton_1);
		jPanel_buttons.add(jButton_2);
		jPanel_buttons.add(jButton_3);
		jPanel_buttons.add(jButton_4);
		jPanel_buttons.add(jButton_5);
		jPanel_buttons.add(jButton_6);
		jPanel_buttons.add(jButton_7);
		jPanel_buttons.add(jButton_8);
		jPanel_buttons.add(jButton_9);
		jPanel_buttons.add(jButton_0);

		jPanel_buttons.add(jButton_Cong);
		jPanel_buttons.add(jButton_Tru);
		jPanel_buttons.add(jButton_Nhan);
		jPanel_buttons.add(jButton_Chia);
		jPanel_buttons.add(jButton_Bang);

		this.setLayout(new BorderLayout());

		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_buttons, BorderLayout.CENTER);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		MyCalculator m1 = new MyCalculator();
	}
}
