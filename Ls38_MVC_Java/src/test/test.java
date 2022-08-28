package test;

import javax.swing.UIManager;

import model.Counter_Model;
import view.CounterView;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Counter_Model cm = new Counter_Model();
		cm.increment();
		cm.increment();
		System.out.println(cm.getValue());
		CounterView ctv = new CounterView();
	}
}
