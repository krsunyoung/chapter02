package bit2016.paint;

public class Pentagon extends Shape {

	@Override //자동으로 만들어진다. 추상클래스가 있기 때문에. 
	public void draw() {
		System.out.println( "오각형을 그렸습니다.");
	}

}
