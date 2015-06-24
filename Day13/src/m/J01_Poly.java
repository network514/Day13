package m;

import data.J01_ACla;
import data.J01_BCla;
import data.J01_SubCla;
import data.J01_SuperCla;

public class J01_Poly {
// 다형성
// - 하나의 형태를 가진 단위가 여러개 형태의 성질을 가질 수 있는 특성
// - 하나의 레퍼런스가 여러개의 객체 성질을 가질 수 있는 특성
	public static void main(String[] args) {
//		1. 수치 데이터 간 형변환(Cast)
		double d = 123.4567891234;
		float f;
//		f = d;
//		=> 저장하려는 값의 형태(특성)과 저장 공간에 약속된 형태(특성)이 다르기 때문에 저장 불가능
		f = (float) d;
//		=> 저장되는 값의 형태(특성)을 Cast 연산자를 사용하며 변환시키면 공간에 저장 가능하다.
		
//		2. 클래스 간의 형변환?
		
		J01_ACla aa = new J01_ACla();
		J01_BCla bb;
//		bb = aa; // 에러(형태가 다름)
//		bb = (J01_BCla)aa; // 에러
//		=> 클래스 간에는 형변환이 안된다.
		
//		3. 형변환이 가능한 클래스 관계
		J01_ACla aaa = new J01_ACla();
		J01_BCla bbb = new J01_BCla();
		Object obj;
		
		obj = aaa;
		obj = new J01_ACla();
		obj = bbb;
		obj = 10;
		obj = 1.234;
		obj = 'd';
		obj = "가나다라";
//		=> 상속관계에 있는 클래스에 대해서는 형변환이 가능하다.
		
//		4. 상속관계 클래스들의 형변환
		J01_SubCla sub = new J01_SubCla();
		J01_SuperCla sup;
		
		sup = (J01_SuperCla)sub;
//		=> 상속 관계에 있는 서브 클래스 객체에 대한 레퍼런스가 슈퍼클래스 레퍼런스에 저장된다.
//		=> 서브클래스 레퍼런스가 슈퍼클래스 레퍼런스로 형변환이 가능함을 볼 수 있다.
		
		J01_SuperCla pSup = new J01_SuperCla();
		J01_SubCla pSub;
		
		pSub = (J01_SubCla)pSup; 
//		Exception in thread "main" java.lang.ClassCastException: data.J01_SuperCla cannot be cast to data.J01_SubCla at m.J01_Poly.main(J01_Poly.java:54)
//		=> 수퍼클래스로 만든 객체의 고유번호는 서브클래스 레퍼런스 형태로 형변환이 불가능하다.
		
		
	}

}
