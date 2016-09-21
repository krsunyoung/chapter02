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
		
		//Shape rectangle = new Ractangle(); //부모의 타입으로 참조가 가능하다.
		Drawable rectangle=new Rectangle(); 
		//rectangle.draw();
		draw(rectangle);
		
//		Shape circle = new Circle(); //부모의 타입으로 참조가 가능하다.
//		//circle.draw();
//		drawShape(circle);
//		
		Drawable circle=new Circle();
		draw(circle);
		
		Drawable triangle=new Triangle();
		//triangle.draw();
		draw(triangle);
		
//		Shape s = new Shape();
//		s.draw();
		
		draw(new Pentagon());
		
		draw (new ColorPoint(200,100,"white"));
		
		resize(new Circle(10));
		
		//instanceof test
		Circle c10 = new Circle();
		System.out.println(c10 instanceof Circle); //instanceof는 연산자 
		//instanceof 는 상속관계에 있는 클래스만 확인할 수 있다.
//		System.out.println(c10 instanceof Rectangle); //클래스는 상속 받는거에서만 사용할수 있다. 형제 관계이므로 안됨
		System.out.println(c10 instanceof Shape);
		
		//instanceof는 모든 인터페이스에 구현관계를 확인할 수 있다.
		System.out.println(c10 instanceof Drawable);
		System.out.println(c10 instanceof Resizable);
		
		Rectangle rect = new Rectangle();
		System.out.println(rect instanceof Rectangle);
		System.out.println(rect instanceof Shape);
		System.out.println(rect instanceof Drawable);
		System.out.println(rect instanceof Resizable);
		
		resize2(new Rectangle());
	}
//	public static void drawShape(Shape circle){
//		circle.draw();
//	}

	public static void draw(Drawable drawable){
		drawable.draw(); 
	}
	public static void resize2(Drawable drawable){
		if(drawable instanceof Resizable == false){
			return;
		}
		Resizable re = (Resizable)drawable;
		re.resize(0.8);
	} //if문을 안쓰면 안되는 이유는 왜일까................??????
	//void여도 retrun 할수 있다. return은 함수를 빨리 끝낼려고 쓰임
	
	public static void resize(Resizable resizable){
		
		Shape shape = (Shape)resizable;
		double area = shape.calculateArea();
		System.out.println( area);
		resizable.resize(0.5);
		
		area = shape.calculateArea();
		System.out.println(area);
		
	}
	
//	public static void draw(Shape shape){
//		shape.draw(); //shape에서 상속받으면 다 할수 있다..
//	}
}
