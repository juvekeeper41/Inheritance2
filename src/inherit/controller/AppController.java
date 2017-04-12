package inherit.controller;

import java.util.ArrayList;

import stuff.model.*;

public class AppController 
{
	private ArrayList<Derpy> myDerps;
	
	private void setupList()
	{
		myDerps.add(new Pizza());
		myDerps.add(new MorningThing());
		myDerps.add(new AfternoonDerp());
	}
	
	public String doStuffWithList()
	{
		String displayResults = "";
		for(Derpy currentDerp : myDerps)
		{
			displayResults += currentDerp.getDerpifiedName("my derp");
			displayResults += "MorningThing was made by the class \n";
		}
	}
	
	return displayResults;
}
