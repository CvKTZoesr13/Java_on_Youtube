package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColor_View;

public class MyColor_Listener implements ActionListener {
	private MyColor_View myColor_View;

	public MyColor_Listener(MyColor_View myColor_View) {
		this.myColor_View = myColor_View;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String src = e.getActionCommand();
		if (src.equals("Change to red text")) {
			this.myColor_View.ChangeTextColor(Color.RED);
		} else if (src.equals("Change to yellow text")) {
			this.myColor_View.ChangeTextColor(Color.YELLOW);
		} else if (src.equals("Change to green text")) {
			this.myColor_View.ChangeTextColor(Color.GREEN);
		} else if (src.equals("Change to red background")) {
			this.myColor_View.ChangeBackgroundColor(Color.RED);
		} else if (src.equals("Change to yellow background")) {
			this.myColor_View.ChangeBackgroundColor(Color.YELLOW);
		} else if (src.equals("Change to green background")) {
			this.myColor_View.ChangeBackgroundColor(Color.GREEN);
		}

	}

}
