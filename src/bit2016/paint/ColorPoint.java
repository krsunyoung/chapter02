package bit2016.paint;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color){
		setX(x); //this.x = x 안되는 이유는 Point 에 접근을 못하므로 에러가 난다. prviate으로 정의를 해줘서
		setY(y);
		this.color = color;
		
	}
	
	public void show(){
		System.out.println( "[x= " + getX() + ",y= "+ getY() +",color = "+color+"]을 그렸습니다." );
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
