package com.bit2016.paint.shape;

import com.bit2016.paint.i.Drawable;

public class Pentagon extends Shape implements Drawable {

	@Override //자동으로 만들어진다. 추상클래스가 있기 때문에. 
	public void draw() {
		System.out.println( "오각형을 그렸습니다.");
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
