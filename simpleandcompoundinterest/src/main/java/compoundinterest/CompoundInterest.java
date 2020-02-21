package compoundinterest;


public class CompoundInterest{
	
	public static float calculate_compound_interest(float Principle_Amount,float Timeinyears,float RateOfInterestPerAnnum)
	{
		float rate=RateOfInterestPerAnnum;
		float compoundinterest=(float)((Principle_Amount)*(Math.pow(1.0+(rate/100.0),Timeinyears))-Principle_Amount);
		return compoundinterest;
	}

}
