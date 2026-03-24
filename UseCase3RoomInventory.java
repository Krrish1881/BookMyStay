// Use Case 3: Centralized Room Inventory Management

import java.util.*;

class RoomInventory
{
    String roomType;
    int totalRooms;
    private Map<String, Integer> roomAvailability;

    public RoomInventory(String roomType, int totalRooms) 
    {
        this.roomType = roomType;
        this.totalRooms = totalRooms;
        this.roomAvailability = new HashMap<>();
    }

    public void initializeInventory()
    {
        Map<String, Integer> roomAvailability = new HashMap<>();

        for (int i = 1; i <= totalRooms; i++) 
        {
            roomAvailability.put("Room" + i, 1);
        }

        for (Map.Entry<String, Integer> entry : roomAvailability.entrySet()) 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Map<String, Integer> getRoomAvailability() 
    {
        return roomAvailability;
    }

    public void updateRoomAvailability(String roomNumber, int availability) 
    {
        roomAvailability.put(roomNumber, availability);
    }
}

public class UseCase3RoomInventory
{
    public static void main(String[] args) 
    {
        RoomInventory roomInventory = new RoomInventory("Single", 10);
        roomInventory.initializeInventory();
    }
}