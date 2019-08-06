
public class TippableBill extends Bill {
	
	double tip;
	
	public TippableBill() {
		super();
	}
	
	public TippableBill(double subTotal, double taxRate, double tip) {
		super(subTotal, taxRate);
		this.tip = tip;
	}
	
	@Override
	public double calcTotal() {
		double total = super.calcTotal();
		total += tip;
		return total;
	}
	
}
