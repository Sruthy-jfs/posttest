package com.test;
	
	import java.util.ArrayList;
	import com.test.Customer;
	import java.util.List;
	
	public class Main {
		static List OrderList = new ArrayList<Customer>();
		public static void main(String[] args) {
			
		
				
			
			Customer c1=new Customer(5,"Sruthy");
			System.out.println(c1);
			
			Order order1 = new SpecialOrder(1,5,"jeans");
			System.out.println(order1);
			Customer c2=new Customer(6,"Geetha");
			
			addCustomer(c2);
			updateCustomer(c2);
			findCustomer(c2);
			delete(c2);
		}
			
			
			private static void addCustomer(Customer c2) 
			try{
				
					OrderList.add(c2);
					System.out.println("Added Successfully");
				
				}catch(CustomerException )
			private static void updateCustomer(Customer c2) {
		OrderList.set(0, c2);
				System.out.println("Updation Added Successfully");
				}
			private static void findCustomer(Customer c2) {
				boolean bool=OrderList.contains(c2);
				if(bool) {
				System.out.println("Found Customer");
				}
				else {
				System.out.println("Customer not found!");
				}
				}
			private static void delete(Customer c2)
			{
				OrderList.remove(c2);
				System.out.println("Customer Details Removed");
			}
			
		}
	

