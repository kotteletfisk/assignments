package Task2;


import java.util.ArrayList;

public class Main
{
   private static Room living_room = new Room(2, 3, 1 );
   private static Room kitchen = new Room(3,4,1);
   private static Room bed_room = new Room(1, 2, 2);


  private static ArrayList<Room> rooms = new ArrayList<>()
    {{
       add(living_room);
       add(kitchen);
       add(bed_room);
    }};

    private static Building hospital = new Building(rooms,10, 5, false);


    public static void main(String[] args)
    {
        System.out.println(lampCount(rooms));
        System.out.println(isNormal(hospital));
    }

    static int lampCount(ArrayList<Room> rooms)
    {
        int count = 0;
        for (Room r: rooms)
        {
            count += r.getNumberOfLamps();
        }
        return count;
    }

    static boolean isNormal(Building building)
    {
        if (building.getNumberOfFloors() > building.getRooms().size()) return true;

        else
        {
            System.out.println("This is an odd building");
            return false;
        }
    }


}
