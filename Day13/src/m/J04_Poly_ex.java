package m;

import javax.swing.JOptionPane;

import data.*;

public class J04_Poly_ex {
	public static void main(String[] args) {
//		URL을 입력받고, 원하는 서비스를 제공.
//		- 블로그 쓰기/읽기 / 다이어리 쓰기, 읽기
		
		String rcvUrl = null;
		
		String showMenu = "1. 블로그 쓰기 : myPage/blog/write\n" +
						  "2. 다이어리 쓰기 : myPage/diary/write\n" + 
						  "3. 블로그 읽기 : myPage/blog/read\n" +
						  "4. 다이어리 읽기 : myPage/diary/read\n\n" + 
						  "URL을 입력하세요";
		
		J04_Blog blog = new J04_Blog();
		J04_Diary diary = new J04_Diary();
		
		J04_SuperCla actor = null;
		
		while(true){
			rcvUrl = JOptionPane.showInputDialog(showMenu);
			
			String[] arrays = rcvUrl.split("/");
//			.split("기준문자열");
//			=> 지정한 기준 문자열로 rcvUrl을 잘라낼 때 사용하는 메소드
//			=> 결과는 String 배열로 제공된다.
			
//			for(int i=0; i<arrays.length; i++){
//				System.out.println(arrays[i]);
//			} // 참고, 아래가 참고의 결과			
//			myPage - 인덱스 번호 0번
//			blog - 인덱스 번호 1번
//			write - 인덱스 번호 2번
			
//			=> String의 동일성을 확인할 때 문자열1.equals(문자열2)를 사용.
//			=> 문자열1 == 문자열2 (X)
			
			if(arrays[1].equals("blog")){
				actor = blog;
			}else if (arrays[1].equals("diary")){
				actor = diary;
			}else {
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
				continue; 
//				=> while문의 조건식으로 이동함
			}
			
			if(arrays[2].equals("write")){
				actor.write();
			}else if(arrays[2].equals("read")){
				actor.read();
			}
		}
	}
}
