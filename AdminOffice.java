package textadventure;

import concepts.Rooms;

public class AdminOffice extends Rooms{
	
	public String getDescription()
	{
		return "A sea of pleather stretches before you. A desk is topped by a mountain of gray plastic resembling a personal computer. Luxury as farmed to the lowest bidder.";
	}

	public void setItems()
	{
    items[0] = Cabinet1 ;
    items[1] = Cabinet2;
    items[2] = Door;
	}
	public void takeItem(Iteams itemChoice)
	{
		for(int i=0; i>=items.length(); i++)
		{
			if(items[i] == iteamChoice)
			{
				items[i] = null;
				// Put item into inv
			}
		}
	}
}
