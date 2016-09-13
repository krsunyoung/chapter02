package bit2016.goodsman.data;

public class Customer {
	public String name ;
	protected String phone;
	private String email;
	
	//default 접근자로 생성시 CustomerDB 클래스가 실행오류  
	
	void setName(){
		name = "도우넛"; //자기 메소드에서 접근했을때 오류 X public 은 어디서든지 가능하다.
		phone="010-9999-9999"; //protected 자기 안에서 접근 가능.
		email = "@naver.com"; //private 자기 안에서 가능. 
	}
	
}
