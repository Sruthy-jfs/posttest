package com.test;

public class Customer {
public int CustId;
public 	String CustomerName;
public Customer(int custId, String customerName) {
	
	CustId = custId;
	CustomerName =  customerName;
	
}
@Override
public String toString() {
	return "Customer Details \n CustId=" + CustId + "\n  CustomerName=" + CustomerName;
}
public void SendOrder()
{
	System.out.println("Customer Order vRecieved");
}

}
