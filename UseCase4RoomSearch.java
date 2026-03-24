// Use Case 4: Room Search & Availability Check
import java.util.*;
class RoomSearchServices
{
    public void searchAvailableRooms(RoomInventory inventory, Room singleRoom, Room doubleRoom, Room suiteRoom)
    {
        Map<String, Integer> availability = inventory.getRoomAvailability();

        if(availability.get("Singlr") > 0) 
        {
            singleRoom.displayRoomDetails();
        }

        if(availability.get("Double") > 0) 
        {
            doubleRoom.displayRoomDetails();
        }

        if(availability.get("Suite") > 0) 
        {
            suiteRoom.displayRoomDetails();
        }
    }
}

public  class UseCase4RoomSearch
{
    public static void main(String[] args) 
    {
        RoomInventory inventory = new RoomInventory("Single", 10);
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        RoomSearchServices roomSearchServices = new RoomSearchServices();
        roomSearchServices.searchAvailableRooms(inventory, singleRoom, doubleRoom, suiteRoom);
    }
}