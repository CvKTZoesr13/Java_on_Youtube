package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButton_View;

public class LastButton_Controller implements ActionListener{
	private LastButton_View lbv;
	
	public LastButton_Controller(LastButton_View lbv) {
		this.lbv = lbv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("1")) {
			lbv.changeTo_1();
		} else if(src.equals("2")) {
			lbv.changeTo_2();
		} else if(src.equals("3")) {
			lbv.changeTo_3();
		} else {
			lbv.changeTo_4();
		}
		
	}

}
