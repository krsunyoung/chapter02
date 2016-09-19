package chapter02;

public class MathTest {

	public static void main(String[] args) {
		//10 <- abs(- 10 ) 절대값 
//		Math math = new Math();
//		math.abs(-10);
//		위와 같이 써줘도 에러... 쓰지 말것 아래와 같이 표현
		
		int a = Math.abs( - 10 );
		int j = Math.max(10, 20);
				
		
	}
	static int max( int i, int j){
		if (i<j){
			return i;
		}
		return j;
	}

}

/*	안에다 넣으면 에러 나지 않는다.
 * int max( int i, int j){
	if (i<j){
		return i;
	}
	return j;
}*/
