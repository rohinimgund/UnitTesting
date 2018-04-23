package Homework_7;

public class calculatePurchaseClass {

	private double purchaseTotal;
	private boolean discountApplied;
	
	public void calcPurchase (double total, boolean existingMember, boolean validDiscount, boolean validCoupon) {
		double discount;
		if ((existingMember && validDiscount) || (!existingMember && validCoupon))
			discount=0.15;
		else
			discount=0.0;
		
		setDiscountApplied(validDiscount || validCoupon);
		setPurchaseTotal(total * (1-discount));
	}

	public double getPurchaseTotal() {
		return purchaseTotal;
	}

	public void setPurchaseTotal(double purchaseTotal) {
		this.purchaseTotal = purchaseTotal;
	}

	public boolean isDiscountApplied() {
		return discountApplied;
	}

	public void setDiscountApplied(boolean discountApplied) {
		this.discountApplied = discountApplied;
	}
	
}