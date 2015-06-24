package data;

public class J03_SuperCla {
	String name;
	int age;
	
	public void setData(String name, int age){
		System.out.println("나는 수퍼클래스 setData");
		this.name = "둘리";
		this.age = 10;
	}
	
	public String getData(){
		System.out.println("나는 수퍼클래스 getData");
		return "이름 : " + name + ", 나이 : " + age;
	}
	
}
