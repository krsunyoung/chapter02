package bit2016.paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point = new Point(); 
		// 생성자를 만들어준후 에러. 
//		기본 생성자를 Point.java에 만들어줘야 오류가 사라진다.
//		public Point(){
//			
//		}
		
		point.setX( 100 );
		point.setY( 1000 );
		
		point.show();
		
		Point point2 = new Point(200,200);
		point2.show(true);
		
		//point2.disapear(); ->사라지는 값을 만들수 있지만.
		point2.show(false);
		
		Point point3 = new ColorPoint(50,50,"red"); 
		//red가 나타나지 않아서 point show를 colorPoint show에 재구성을 해준다.(오버라이딩)
		point3.show();
		point3.show(false);
		point3.show(true);
		
		Shape rectangle = new Ractangle(); //부모의 타입으로 참조가 가능하다.
		//rectangle.draw();
		draw(rectangle);
		
//		Shape circle = new Circle(); //부모의 타입으로 참조가 가능하다.
//		//circle.draw();
//		drawShape(circle);
//		
		
		Shape circle = new Circle();
		draw(circle);
		
		Shape triangle = new Triangle(); //부모의 타입으로 참조가 가능하다.
		//triangle.draw();
		draw(triangle);
		
//		Shape s = new Shape();
//		s.draw();
		
		draw(new Pentagon());
		
	}
//	public static void drawShape(Shape circle){
//		circle.draw();
//	}

	public static void draw(Shape shape){
		shape.draw(); //shape에서 상속받으면 다 할수 있다..
	}
}
