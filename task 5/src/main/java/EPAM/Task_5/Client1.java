package EPAM.Task_5;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client1 
{
	private static final Logger LOGGER=LogManager.getLogger(Client1.class);
	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main( String[] args )
	{
		Scanner scan=new Scanner(System.in);
		String str=null;
		Interest obj=new Interest();
		LOGGER.info("Enter the principle amount");
		double principle=scan.nextDouble();
		LOGGER.info("Enter the time period");
		double time_period=scan.nextDouble();
		LOGGER.info("Enter the rate of interest");
		double rateofinterest=scan.nextDouble();
		do {
			LOGGER.info("1.Simple Interest\n2.Compound Interest");
			LOGGER.info("Enter the choice");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				LOGGER.info(df.format(obj.getSimpleInterest(principle,time_period,rateofinterest)));
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				LOGGER.info("Exited from Simple Interest");
				break;
			case 2:
				LOGGER.info(df.format(obj.getCompoundInterest(principle,time_period,rateofinterest)));
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				LOGGER.info("Exited from Compound Interest"); 
				break;
			}
			LOGGER.info("Do you want to continue Y/N?");
			str=scan.next();
		}while(str.equalsIgnoreCase("Y"));
	}
}