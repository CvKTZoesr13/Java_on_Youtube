package test;

import javax.swing.UIManager;

import view.MyColor_View;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		new MyColor_View();
	}
}
