package CalcEngine;

import java.text.DecimalFormat;

public class Calculator{
	
	public double Calculator(double amount, double years, double rate){
		
		
		double FV;
		FV = amount * Math.pow((1 + (rate/100)), years);
		FV =Double.parseDouble(new DecimalFormat("##.##").format(FV));
		
		return FV;
	}

}
