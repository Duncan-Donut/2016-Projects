public class Billing{
	
	public static void main(String[] args){

	Billing bill = new Billing();
	
	System.out.println(bill.computeBill(4.99,5,3.00));
		
	}
	
	public double computeBill(double price){
		double tax = price * .08;
		return tax + price;
	}
	public double computeBill(double price, int quantity){
		double beforeTax = price * quantity;
		double afterTax = beforeTax * .08;
		return afterTax + beforeTax;
	}
	public double computeBill(double price, int quantity, double Coupon){
		double beforeTax = (price * quantity) - Coupon;
		double afterTax = beforeTax * .08;
		return afterTax + beforeTax;

	}
	
	
	
	
	
	
	
}