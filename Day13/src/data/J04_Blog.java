package data;

import javax.swing.JOptionPane;

public class J04_Blog extends J04_SuperCla{
	String bCont;
	
	public void write(){
		bCont = JOptionPane.showInputDialog("블로그 내용을 입력해주세요");
	}
	public void read(){
		JOptionPane.showMessageDialog(null, "나의 블로그\n" + bCont);
	}
}
