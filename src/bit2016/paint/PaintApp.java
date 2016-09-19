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
		
	}

}
