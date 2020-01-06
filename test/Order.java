package com.test;

public abstract class Order {
	public int  Orderid;
	public int Quantity;
	public String OrderName;
public abstract void confirm();
public abstract void close();
}
