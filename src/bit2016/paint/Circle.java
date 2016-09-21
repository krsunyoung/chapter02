package bit2016.paint;

public class Circle extends Shape implements Drawable, Resizable {
	private int x1;
	private int y1;
	private int radius;
	public Circle(){
		
	}
	public Circle(int radius){
		//super();
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("원을 그렸습니다. ");
	}
	@Override
	public double calculateArea() {
		// Math.PI = 3.14; 오류 디컴파일 
		return radius* radius*Math.PI; //PI 클래스 변수 상수. 모르면 F3
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
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void resize(double ratio) {
		radius = (int)(radius * ratio);  //radius =radius * ratio 로 쓰면 에러난다...  
	}
}
