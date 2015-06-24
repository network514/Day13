package data;

public class J03_SubCla extends J03_SuperCla{
	double height;
	double weight;
	
	public void setData(){
		System.out.println("난 서브클래스 setData");
		this.name = "길동이";
		this.age = 100;
		this.height = 12.34;
		this.weight = 45.67;
	}
	
	public String getData(){
		System.out.println("난 서브클래스 getData");
		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 몸무게 : " + weight;
	}
}
