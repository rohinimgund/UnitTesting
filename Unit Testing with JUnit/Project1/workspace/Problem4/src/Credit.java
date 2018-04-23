public class Credit{
	
	public boolean isCreditIncreasable (double invoice, double credit, double balance, double interest) {
		
		boolean a=false;
		if (invoice<3000.00)
			if (credit >5000.00)
				if (balance<1500.00)
					if (interest < 0.13)
						a=true;
		return a;
	 }
}