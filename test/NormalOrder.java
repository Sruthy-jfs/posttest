package com.test;

public class NormalOrder extends Order {
	public int  Orderid;
	public int Quantity;
	public String OrderName;
		// TODO Auto-generated constructor stub
	

	
	public NormalOrder(int orderid, int quantity, String orderName) {
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
		return "Normal Order Details : \n Orderid=" + Orderid + "\n Quantity=" + Quantity + "\n Order Name=" + OrderName ;
	}
	
}
