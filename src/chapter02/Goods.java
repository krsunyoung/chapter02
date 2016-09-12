package chapter02;

public class Goods {
	
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
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if ( price < 0 ){
			price = 0 ;
		}
		this.price = price;
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
	
}
