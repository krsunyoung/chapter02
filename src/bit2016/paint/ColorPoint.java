package bit2016.paint;

public class ColorPoint extends Point implements Drawable {
	private String color;
	
	public ColorPoint(int x, int y, String color){
//		setX(x); //this.x = x 안되는 이유는 Point 에 접근을 못하므로 에러가 난다. prviate으로 정의를 해줘서
//		setY(y);
		super(x,y); //이렇게 써주면 간단하게 부모생성자를 호출할수 있다.
		//super.point 써주면  부모의 메소드나 변수를 부를수있다. 
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

	@Override
	public void draw() {
		show();
	}
	
}
