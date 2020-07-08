package EPAM.Task_5;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction {
	private static final EPAM.Task_5.LOGGER LOGGER=LogManager.getLogger(Construction.class);
	public int construct(int total_area,int material_cost)
	{
		LOGGER.info("Entered the Construction method");
		int total_cost=total_area*material_cost;
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return total_cost;
	}
}