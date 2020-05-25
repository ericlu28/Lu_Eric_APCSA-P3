U5X16VUY
EAL

import java.util.ArrayList;

//a
public void updateRecentlyUsedApps()
{
	int timesUsed = 0;
	boolean used = getUsed();
	
	if (used == true)
	{
		timesUsed++;
	}
}

//b
public ArrayList<App> updateAppStatus()
{
	ArrayList<App> RarelyUsedApps = new ArrayList<App>();
	boolean indicator = false;
	for (App s : this.allApps)
	{
		int timesUsed = getNumTimes();
		if (timesUsed <= 5)
		{
			return true;
			rarelyusedapps.add(new App(s));
		}
	}
	return RarelyUsedApps;
}

//c
- The method header for getMostExpensiveApp would be public App getMostExpensiveApp()
- I would add a new variable: private double appPrice, that records the price of each app downloaded and adds the prices to a new instantiated variable: private ArrayList<App> appPrices. To use the getMostExpensiveApp method, a loop will loop through the appPrices arrayList and find the largest value. 