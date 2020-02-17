import java.util.*;
class SimComInterest
{
	SimComInterest(double pricipleamount,double rateofinterest,double time)
	{
		double simpleinterest , compoundinterest;
		simpleinterest=(pricipleamount * time * rateofinterest)/100;
		compoundinterest=pricipleamount * Math.pow(1.0 + rateofinterest / 100.0 , time) - pricipleamount;
	}
}