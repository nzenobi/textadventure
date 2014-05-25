package textadventure;
public class Rooms {
    
    String name;
    Rooms[] neighbors = new Rooms[4];
    
    public static final int NORTH=0;
    public static final int EAST=1;
    public static final int SOUTH=2;
    public static final int WEST=3;

	public Rooms (String name, Rooms north, Rooms east, Rooms south, Rooms west)
	{
				this.name = name;
				neighbors[0] = north;
                neighbors[1] = east;
                neighbors[2] = south;
                neighbors[3] = west;
	}
	Rooms[] Room = new Rooms[7];
	Room[0] = GuardRoom;
	Room[1] = Office;
	Room[2] = 
	public Rooms getRoomsInDirection(int dir){
            return neighbors[dir];
        }

}
