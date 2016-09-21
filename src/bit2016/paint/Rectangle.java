package bit2016.paint;

public class Rectangle extends Shape implements Drawable {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Rectangle(){
		//super();
		
	}
	public Rectangle(int x1, int y1, int x2, int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	@Override //태크 컴파일러가 오버라이드 가능한지 확인하는 작업.
	public void draw() {
		
		//this는 나지만 super는 부모 자신을 this (부모의 메소드나 필드) 부모를 가르킬때 사용.
		//super.draw(); 
		//없애서[ 완전 재정의 ] 할수 있다.
		
		System.out.println( "사각형을 그렸습니다.");
	}
	//메소드에 override를 추가 
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
}
