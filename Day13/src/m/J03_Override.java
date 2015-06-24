package m;

import data.*;

public class J03_Override {
	public static void main(String[] args) {
//		1. 수퍼클래스의 모든 메소드가 오버라이드 된 상태
		J03_SubCla sub = new J03_SubCla();
		sub.setData();
		System.out.println(sub.getData());
		
//		2. 서브클래스 객체의 고유번호 저장된 서브클래스 레퍼런스를 
//		수퍼클래스 레퍼런스로 형변환
		
		J03_SuperCla sup;
		sup = (J03_SuperCla)sub;
		System.out.println(sup.getData()); // 서브클래스가 출력됨.
	}
}
