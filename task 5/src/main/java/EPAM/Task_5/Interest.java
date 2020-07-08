package EPAM.Task_5;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import EPAM.Task_5.Interest.*;
public class Interest {
	private static final Logger LOGGER=LogManager.getLogger(Interest.class);
	public double getSimpleInterest(double principle,double time,double rate_of_interest)
	{
		LOGGER.info("Entered the Simple Interest method");
		double simple_interest=(principle*time*rate_of_interest)/100;
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return simple_interest;
	}
	public double getCompoundInterest(double principle,double time,double rate_of_interest)
	{
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LOGGER.info("Entered the Compound Interest method");
		double res=(1+(rate_of_interest/100));
		double interest= Math.pow(res,time);
		double compound_interest=interest*principle-principle;
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return compound_interest;
	}
}
