package m;

import data.*;

public class J02_Poly {
	public static void main(String[] args) {
//		1. 서브클래스 객체 생성 및 레퍼런스 변수 확보
		J02_SubCla sub = new J02_SubCla();
		System.out.println(sub.supMsg);
		sub.supWorks();
//		=> 수퍼클래스로부터 물려받은 멤버 변수 및 메소드 이용 가능
		System.out.println(sub.subMsg);
		sub.subWorks();
//		=> 자신의 멤버 변수 및 메소드 이용 가능
		
//		2. 서브클래스 레퍼런스의 값(고유번호)을 수퍼클래스 레퍼런스에 저장 (형변환처리)
		J02_SuperCla sup;
		sup = (J02_SuperCla)sub;
		
		System.out.println(sup.supMsg);
		sup.supWorks();
//		=> 수퍼클래스의 멤버 변수 및 메소드 이용가능
		
//		System.out.println(sup.subMsg); //에러
//		sup.subWorks(); // 에러 
//		=> 서브클래스의 멤버 변수 및 메소드 이용 불가능
		
//		3. 형변환된 고유번호를 가지고 있는 수퍼클래스 레퍼런스의 형태를
//		다시 서브 클래스로 형변환 한 후 접근 재시도
		
		J02_SubCla newSub = (J02_SubCla)sup;
		System.out.println(newSub.supMsg);
		newSub.supWorks();
//		=> 수퍼클래스의 멤버 변수 및 메소드 이용가능
		
		System.out.println(newSub.subMsg);
		newSub.subWorks();
//		=> 서브클래스의 멤버 변수 및 메소드 다시 이용 가능

//		참고 : 
//		=> 상속관계의 클래스 형변환에 대하여 서브클래스 객체의 고유번호를 가진
//		레퍼런스는 수퍼클래스 레퍼런스 형태로 자동으로 형변환 가능하다.
//		단, 그 반대의 경우는 불가능
		J02_SubCla ss = new J02_SubCla();
		J02_SuperCla pp;
		
		pp = ss; // 자동형변환 가능
		
		J02_SubCla sss;
//		sss = pp; // 자동형변환 불가능(Cast연산자 필요)
		sss = (J02_SubCla)pp;
	}
}
