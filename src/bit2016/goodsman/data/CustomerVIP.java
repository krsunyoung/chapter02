package bit2016.goodsman.data;

public class CustomerVIP extends Customer {
	void setNmae(){
		name = "둘리";
		//public 은 자식 패키지에서 접근 가능.
		
		phone= "010-0000-0000";
		// proteced는 자식에서 접근이 가능
		
		//email="@hanmail.net";
		//private 자식에서 접근 불가.
	}
}
