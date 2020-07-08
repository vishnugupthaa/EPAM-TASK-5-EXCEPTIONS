package EPAM.Task_5;


import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import EPAM.Task_5.Client;

public class Client 
{
	private static final Logger LOGGER=LogManager.getLogger(Client.class);
	public static void main( String[] args )
	{
		String automated=null;
		Scanner scan=new Scanner(System.in);
		LOGGER.info("Enter the total area of the house");
		int total_area=scan.nextInt();
		Construction obj=new Construction();
		String choice1=null;
		do
		{
			LOGGER.info("Enter your choice: ");
			LOGGER.info("\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High standard Material and Fully automatic home");
			int choice=scan.nextInt();
			if(choice!=4){
				LOGGER.info("Do you want a fully automated house(y/n)");
				automated=scan.next();
			}
			switch(choice)
			{
			case 1:
				if(automated.equalsIgnoreCase("y")) {
					LOGGER.info(obj.construct(total_area,1900));
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					LOGGER.info("Exited from Construction method");
				}
				else {
					LOGGER.info(obj.construct(total_area,1200));
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					LOGGER.info("Exited from Construction method");
				}
				break;
			case 2:
				if(automated.equalsIgnoreCase("y"))
				{
					java.lang.System.Logger.info(obj.construct(total_area,2200));
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					EPAM.Task_5.LOGGER.info("Exited from Construction method");
				}
				else
				{
					LOGGER.info(obj.construct(total_area,1500));
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					LOGGER.info("Exited from Construction method");
				}
				break;
			case 3:
				if(automated.equalsIgnoreCase("y"))
				{
					LOGGER.info(obj.construct(total_area,2500));
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					LOGGER.info("Exited from Construction method");

				}
				else
				{
					LOGGER.info(obj.construct(total_area,1800));
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					LOGGER.info("Exited from Construction method");
				}
				break;
			case 4:
				LOGGER.info(obj.construct(total_area,2500));
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				LOGGER.info("Exited from Construction method");
				break;	
			}
			LOGGER.info("Do you want to change your choice y/n?");
			choice1=scan.next();
		}while(choice1.equalsIgnoreCase("Y"));
	}
}