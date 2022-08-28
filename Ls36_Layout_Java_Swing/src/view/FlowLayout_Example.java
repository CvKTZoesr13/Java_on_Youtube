package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout_Example extends JFrame{
	
	public FlowLayout_Example() {
		this.setTitle("Layout");
		this.setSize(500, 700);
		this.setLocationRelativeTo(rootPane);
		// set layout
		GridLayout fl = new GridLayout(4,4);
		this.setLayout(fl);

		for (int i = 0; i < 10; i++) {
			JButton jButton = new JButton(i +"");
			// add to components
			this.add(jButton);
		}

		

		
		
		
		
		
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	};
	public static void main(String[] args) {
		
		new FlowLayout_Example();
	}
}
