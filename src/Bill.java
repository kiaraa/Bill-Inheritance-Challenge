
public class Bill {
	
	double subTotal;
	double taxRate;
	
	public Bill() {
		
	}
	
	public Bill (double subTotal, double taxRate) {
		this.subTotal = subTotal;
		this.taxRate = taxRate;
	}
	
	public double calcTotal() {
		return (subTotal * (1 + taxRate));
	}
	
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	
}
