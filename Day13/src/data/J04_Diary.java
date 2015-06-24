package data;

import javax.swing.JOptionPane;

public class J04_Diary extends J04_SuperCla{
	String dCont;
	
	public void write(){
		dCont = JOptionPane.showInputDialog("다이어리 내용 입력");
	}
	public void read(){
		JOptionPane.showMessageDialog(null, "나의 일기\n" + dCont);
	}
}
