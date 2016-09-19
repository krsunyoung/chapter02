package chapter02;

public class ArrayUtil {
	public static double[] intToDouble(int[] a){
		if(a == null){
			return null;
		} //return을 만나면 break 함수와 비슷한 
		
		int length = a.length;
		double[] result = new double[length];
		for (int i = 0; i<length; i++){
			result[i] = a [i];
		}
		
		return result;	
	}
	
	public static int[] doubleToDouble(double[] b){
		if(b == null){
			return null;
		}	
		int length = b.length;
		int[] result = new int[length];
		for (int i = 0; i<length; i++){
			result[i] =(int) b[i];
		}
		return result;	
	}
	
	public static int[] concat(int[] c, int[] d){
		int length1 = ( c== null)? 0:c.length;
		int length2 = ( d== null)? 0:d.length;
		int length = length1 + length2;
		int[] result = new int[length]; 
		//지역변수는 사라지는데 안사라졌다. 왜그랬을까 ? 바깥에서 리턴해 주는놈을 하나가 더 참조.
		
		int index = 0;
		for(int i = 0; i<length1; i++){
			result[index]= c[i];
			index++;
		}
		for(int i = 0; i<length1; i++){
			result[index]= d[i];
			index++;
		}
		return result;
		
		/* 내가 만든것
		if(c == null || d == null){
			return null;
		}
		int length = c.length+d.length;
		int[] result = new int[length];
		for (int i = 0; i<length; i++){
			result [i]= c[i]+d[i];
		}
		return result;
		*/
	}
	
	
}
