package bit2016.goodsman.db;

import bit2016.goodsman.data.Customer;

public class CustomerDB {
	//메소드 생성
	void insert() {
		
		Customer c = new  Customer(); //서로 패키지가 다르면 자동으로 안짜져서
		// c.name="안대혁"; 
		// 같은 패키지 안에 있으면 오류가 나지 않는데 다른 패키지에 default로 되어있어서 오류가 난다.
		
		c.name="안대혁";
		//public으로 할경우 오류 X 다른 패키지에서 접근할때 가능
		
		//c.phone="010-0000-0000"; 
		//다른 패키지로 할때 오류  protected 
		
		//c.email="@nate.com";
		//prviate 은 외부패키지에서는 접근 불가
	}
}
