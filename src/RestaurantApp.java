
public class RestaurantApp {

	public static void main(String[] args) {
		
		Bill normalBill = new Bill(15.80, 0.06);
		pay(normalBill);
		
		TippableBill tipBill = new TippableBill(8.50, 0.06, 2.00);
		pay((Bill)tipBill);

	}

	public static void pay(Bill bill) {
		System.out.println("$" + bill.calcTotal());
	}
}
