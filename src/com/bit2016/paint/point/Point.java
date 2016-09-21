package com.bit2016.paint.point;

public class Point {
	private int x;
	private int y;
	
	public Point(){	
	}
	
	public Point(int x , int y){
		//생성자
		this.x = x; 
		this.y = y;
		System.out.println("객체생성");
	}

	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void show(){
		System.out.println( "[x= " + x + ",y= "+ y +"]을 그렸습니다." );
	}
	public void show(boolean visible){ //false면 지워버리거
		if(visible ==true){
		// System.out.println( "[x= " + x + ",y= "+ y +"]을 그렸습니다." ); 
		// 해되 되지만 하나씩 복사할수 없으니  아래 와 같이 한다.
			show();
		}else{
		System.out.println( "[x= " + x + ",y= "+ y +"]을 지웠습니다." );
		}
	}
	
	
}
