package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.Counter_Model;

public class CounterView extends JFrame {
	private Counter_Model Counter_Model;
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_reset;
	private JLabel jLabel_value;

	public CounterView() {

		this.Counter_Model = new Counter_Model();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Counter");

		this.setLocationRelativeTo(null);
		this.setSize(400, 500);
		this.setAlwaysOnTop(isAlwaysOnTop());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ActionListener ac = new CounterListener(this);

		jButton_up = new JButton("UP");
		jButton_up.addActionListener(ac);
		jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(ac);
		jButton_reset = new JButton("RESET");
		jButton_reset.addActionListener(ac);
		jLabel_value = new JLabel(this.Counter_Model.getValue() + "", JLabel.CENTER);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());

		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		jPanel.add(jButton_down, BorderLayout.EAST);
		jPanel.add(jButton_reset, BorderLayout.SOUTH);
		this.setLayout(new BorderLayout());

		this.add(jPanel, BorderLayout.CENTER);

	}

	public void increment() {
		this.Counter_Model.increment();
		this.jLabel_value.setText(this.Counter_Model.getValue() + "");
	}

	public void decrement() {
		this.Counter_Model.decrement();
		this.jLabel_value.setText(this.Counter_Model.getValue() + "");
	}
	public void resetCounter() {
		this.Counter_Model.resetCounter();
		this.jLabel_value.setText(this.Counter_Model.getValue() + "");
	}
}
