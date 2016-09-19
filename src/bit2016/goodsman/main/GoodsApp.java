package bit2016.goodsman.main;

import bit2016.goodsman.data.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		 Goods goods = new Goods ();
		 goods.setName( "nikon");
		 //goods.price = -1; 로 입력할 가능성이 있기때문에
		 goods.setPrice (200000);
		 goods.setCountStock(50);
		 goods.setCountSold(10);
		 //같은 패키지 안에서는 적용되지만 다른 패키지는 지정해줘야 한다. 
		 
		// System.out.println(goods.name + " : " + goods.price + " : " + 
		// 						goods.countStock + " : "+goods.countSold);
		//get으로 바꿔줘야 위가 실행될수 있음.  
		//외부에서 직접 셋팅 못하게 막는다. 
		 

		 
		 
		System.out.println(goods.getName() + " : " + goods.getPrice() + " : " + 
							goods.getCountStock() + " : "+goods.getCountSold());
		Goods goods2 = new Goods();
		
		 System.out.println(Goods.count); //goods , goods2 두개를 생성자호출하기때문에 Goods 에 count++ 로 인한 증가
		 
		 goods.showInfo();
		 
		 int discountPrice = goods.calcDiscountPrice(0.1);
		 System.out.println( discountPrice );
		 // int discountPrice = (int)(0.1*goods.getPrice()); 위와 동일
	}

}
