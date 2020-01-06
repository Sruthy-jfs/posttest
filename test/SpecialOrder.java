package com.test;

public class SpecialOrder extends Order {
	

	public int  Orderid;
	public int Quantity;
	public String OrderName;
		// TODO Auto-generated constructor stub
	

	
	public SpecialOrder(int orderid, int quantity, String orderName) {
			super();
			Orderid = orderid;
			Quantity = quantity;
			OrderName = orderName;
		}

	



	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Done Shopping!");
		
	}


	@Override
	public void confirm() {
		// TODO Auto-generated method stub
		System.out.println("Order is confirmed");
	}





	@Override
	public String toString() {
		return "Special Order Details : \n Orderid=" + Orderid + "\n Quantity=" + Quantity + "\n Order Name=" + OrderName ;
	}
	

}
