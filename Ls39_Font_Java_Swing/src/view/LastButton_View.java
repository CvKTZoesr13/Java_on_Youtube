package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButton_Controller;
import model.LastButton;

public class LastButton_View extends JFrame {
	private LastButton lastButton;
	private JLabel jLabel;

	public LastButton_View() {
		this.lastButton = new LastButton();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Last Button");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// event action listener
		ActionListener ac  = new LastButton_Controller(this);
		
		
		JPanel jPanel_center = new JPanel();
		jPanel_center.setLayout(new GridLayout(2, 2));
		Font font = new Font("Segoe UI", Font.BOLD, 20);
		JButton jButton_1 = new JButton("1");
		jButton_1.setFont(font);
		jButton_1.addActionListener(ac);
		JButton jButton_2 = new JButton("2");
		jButton_2.setFont(font);
		jButton_2.addActionListener(ac);
		JButton jButton_3 = new JButton("3");
		jButton_3.setFont(font);
		jButton_3.addActionListener(ac);
		JButton jButton_4 = new JButton("4");
		jButton_4.setFont(font);
		jButton_4.addActionListener(ac);
		jPanel_center.add(jButton_1);
		jPanel_center.add(jButton_2);
		jPanel_center.add(jButton_3);
		jPanel_center.add(jButton_4);
		
		
		JPanel jPanel_footer = new JPanel();
		jLabel = new JLabel("Click button to see somthing happen!");
		jLabel.setFont(font);
		jPanel_footer.add(jLabel);

		this.setLayout(new BorderLayout());
		this.add(jPanel_center, BorderLayout.CENTER);
		this.add(jPanel_footer, BorderLayout.SOUTH);
	}
	
	
	public void changeTo_1() {
		this.lastButton.setValueTo_1();
		jLabel.setText("Last button which you clicked is: "+ this.lastButton.getValue()+". Enjoy it!");
	}
	public void changeTo_2() {
		this.lastButton.setValueTo_2();
		jLabel.setText("Last button which you clicked is: "+ this.lastButton.getValue()+". Enjoy it!");
	}
	public void changeTo_3() {
		this.lastButton.setValueTo_3();
		jLabel.setText("Last button which you clicked is: "+ this.lastButton.getValue()+". Enjoy it!");
	}
	public void changeTo_4() {
		this.lastButton.setValueTo_4();
		jLabel.setText("Last button which you clicked is: "+ this.lastButton.getValue()+". Enjoy it!");
	}
}
