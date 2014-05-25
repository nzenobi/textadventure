package textadventure;

import concepts.Rooms;

public class GuardRoom extends Rooms
{

	public String getDescription()
	{
		return "The Room is dark and damp. To your North is a Cabinet. To your East is a desk with a latern on it. To your south is another Cabinet. To your west is a door.";
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
