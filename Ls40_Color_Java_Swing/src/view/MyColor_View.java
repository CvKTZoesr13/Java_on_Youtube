package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

import controller.MyColor_Listener;
import model.MyColor_Model;

public class MyColor_View extends JFrame {
	private MyColor_Model MyColor_Model;
	private JLabel jLabel;

	public MyColor_View(model.MyColor_Model myColor_Model) throws HeadlessException {
		MyColor_Model = myColor_Model;
	}

	public MyColor_View() {
		this.init();

	}

	private void init() {
		this.setTitle("My Color");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		jLabel = new JLabel();
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));
		// Action Listener
		
		ActionListener myCoLorListener = new MyColor_Listener(this);
		
		Font font = new FontUIResource("Segoe UI", Font.BOLD, 20);

		JButton jButton_text_red = new JButton("Change to red text");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.RED);
		jButton_text_red.addActionListener(myCoLorListener);

		JButton jButton_text_yellow = new JButton("Change to yellow text");
		jButton_text_yellow.setFont(font);
		jButton_text_yellow.setForeground(Color.YELLOW);
		jButton_text_yellow.addActionListener(myCoLorListener);
		
		
		JButton jButton_text_green = new JButton("Change to green text");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.addActionListener(myCoLorListener);
		
		
		JButton jButton_background_red = new JButton("Change to red background");
		jButton_background_red.setFont(font);
		jButton_background_red.setBackground(Color.RED);
		jButton_background_red.setBorderPainted(false);
		jButton_background_red.addActionListener(myCoLorListener);
		
		JButton jButton_background_yellow = new JButton("Change to yellow background");
		jButton_background_yellow.setFont(font);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.setBorderPainted(false);
		jButton_background_yellow.addActionListener(myCoLorListener);
		
		JButton jButton_background_green = new JButton("Change to green background");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.setBorderPainted(false);
		jButton_background_green.addActionListener(myCoLorListener);

		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_yellow);
		jPanel.add(jButton_text_green);
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_yellow);
		jPanel.add(jButton_background_green);

		jLabel.setText("TEXT");
		Font font_text = new Font("Segoe UI", Font.BOLD, 100);
		jLabel.setFont(font_text);


		
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void ChangeTextColor(Color color) {
		this.jLabel.setForeground(color);
	}

	public void ChangeBackgroundColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
	}

}
