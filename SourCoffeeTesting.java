package oopday2;

public class SourCoffeeTesting {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.name = "Dung Xau Xa";
		
		Customer customer2 = new Customer();
		customer2.name = "Mai";
		
		Customer customer3 = new Customer();
		customer3.name = "Jim";
		
		Customer [] customers = {customer1, customer2, customer3};
		
		
		
		Product product1 = new Product();
		product1.name = "Black coffee";
		product1.price = 15;
		
		Product product2 = new Product();
		product2.name = "White coffee";
		product2.price = 15.5;
		
		Product product3 = new Product();
		product3.name = "Brown coffee";
		product3.price = 18.5;
		
		Product [] products = { product1, product2, product3}; 
		
		
		Order order1 = new Order();
		order1.code = "0001";
		order1.product = product1;
		order1.customer = customer1;
		order1.date = new java.util.Date();
		order1.quantity = 2;
		order1.price = order1.product.price;
		order1.total = order1.product.price * order1.quantity;
		
		
		Order order2 = new Order();
		order2.code = "0002";
		order2.product = product2;
		order2.customer = customer2;
		order2.date = new java.util.Date();
		order2.quantity = 2;
		order2.price = order2.product.price;
		order2.total = order2.product.price * order2.quantity;
		
		Order [] orders = { order1, order2};
		
		for (Order order: orders) {
			System.out.println("Order code: "+ order.code);
			System.out.println("Order product: " + order.product.name);
			System.out.println("Customer: "+ order.customer.name);
			System.out.println("Date: " + order.date);
			System.out.println("Quantity: "+order.quantity);
			System.out.println("Price: "+ order.price);
			System.out.println("Total: "+ order.total);
			System.out.println("---------------");
		}
			
	}
	//Write function to show ORDER DETAILS (all or a specific ORDER NUMBER) (5 points)
	public static void printOrderDet(Order order) {
		System.out.println("Order code: "+ order.code);
		System.out.println("Order product: " + order.product.name);
		System.out.println("Customer: "+ order.customer.name);
		System.out.println("Date: " + order.date);
		System.out.println("Quantity: "+order.quantity);
		System.out.println("Price: "+ order.price);
		System.out.println("Total: "+ order.total);
		System.out.println("---------------");
	}
	
	public static Order getOrder(String code, Order [] ordersSource) {
		Order result = null;
		for ( Order order : ordersSource) {
			if (order.code.equals(code)) {
				result = order;
			}
		}
		return result;
		
	}

}
