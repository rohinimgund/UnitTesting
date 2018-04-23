public class Expression {
	public double calcY (double x) {
			double y;
			if (x<-2.0)
				y = 0;
			else
				if (x<0.0)
					y = x+2;
				else
					if (x<4.0)
						y= -x*x+4*x+2;
					else
						if (x<6.0)
							y = -x+6;
						else
							y = 0.0;
			return y;
		}
}