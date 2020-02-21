package simpleinterest;

public class SimpleInterest {

public static float calculate_simple_interest(float Principle_Amount,float Timeinyears,float RateOfInterestPerAnnum)
{
	float SimpleInterest=(Principle_Amount*Timeinyears*RateOfInterestPerAnnum)/100;
	return SimpleInterest;
}
}
