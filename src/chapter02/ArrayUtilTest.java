package chapter02;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] arrayInt = { 10,20,30,40,50};
		int[] arrayInt2 = null; 
	
		
		ArrayUtil au = new ArrayUtil();
		
		double[] arrayDouble = au.intToDouble(arrayInt); 
		//ArrayUtile을 public을 해줬을 경우 ArrayUtile.intToDouble로 해도 가능하다.
		for(int i = 0; i<arrayDouble.length; i++){
			System.out.print( arrayDouble[i] +" " );
		}
		System.out.println(" ");
		
		//double  배열을 int 배열로 변환
		
		double[] arraydouble2 ={ 10.1, 20.2, 30.3};
		int[] arrayInt3 = ArrayUtil.doubleToDouble(arraydouble2);
		for(int i = 0; i<arrayInt3.length; i++){ //for(int i : arrayInt3) 와 같음
			System.out.print( arrayInt3[i]+" " );
		}
		System.out.println(" ");
		
		//int 배열 두개를 연결한 새로운 배열 리턴
/*		int[] arrayconcat = { 1, 2, 3 ,4, 5};
		int[] arrayconcat2 = { 6, 7, 8 , 9, 10};
		
		int[] arrayInt4 = ArrayUtil.concat(arrayconcat, arrayconcat2);
	*/	
		int[] a = { 1, 2, 3 ,4, 5};
		int[] b = { 6, 7, 8 , 9, 10};
		
		int[] c = ArrayUtil.concat(a, b);
		for(int i : c){
			System.out.print(i+" ");
		}
		
	}

}
