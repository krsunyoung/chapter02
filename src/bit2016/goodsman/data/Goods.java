package bit2016.goodsman.data;

public class Goods {
	public Goods(){
		//기본생성자
		System.out.println("생성자 호출");
		count++;
	}
	public static int count; //클래스 변수 , 스태틱변수 
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//source에 Generate Getters and Setters 를 클릭하면 아래 처럼 다른 클래스에서 쓸수 있게끔 만들어 준다.
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}//return 값이 없고 매개변수(parameter)가 있는 메소드
	
	public int getPrice() {
		return price; //반드시 하나 retrun 문이 있어야 한다. 없으면 에러!
	}	//return 값이 있고 매개변수(parameter)가 없는 메소드
	
	public void setPrice(int price) {
		if ( price < 0 ){
			price = 0 ;
		}
		this.price = price;
		//객체 자신을 가르킬때 this를 쓰임.
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	
	public void showInfo(){
		System.out.println("name : " + name +", price : "+ price + ", count : "+countStock 
				+",countSold :" +countSold);	
	}	//return 값과 매개변수(parameter)가 없는 메소드
	
	public int calcDiscountPrice(double rate){
		int discountPrice = (int)(price * rate);
		return discountPrice;
	} 	//return 값과 매개변수(parameter)도 있는 메소드
	
}
