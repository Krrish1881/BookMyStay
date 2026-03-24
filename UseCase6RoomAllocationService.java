// Use Case 6: Reservation Confirmation & Room Allocation
import java.util.*;

class RoomAllocationService
{
    private Set<String> allocatedRoomsIds;

    private Map<String, Integer> assignedRoomsByType;

    public RoomAllocationService() 
    {
        allocatedRoomsIds = new HashSet<>(); // Set to store allocated room IDs
        assignedRoomsByType = new HashMap<>(); // Map to store assigned rooms by type
    }

    public void allocateRoom(Reservation reservation, RoomInventory inventory)
    {
        String roomType = reservation.getRoomType();
    }

    private String generateRoomId(String roomType) 
    {
        // Generate a unique room ID based on room type
        return "Room_" + roomType + "_" + System.currentTimeMillis();
    }
}

public class UseCase6RoomAllocationService 
{
    public static void main(String[] args) 
    {
        RoomAllocationService roomAllocationService = new RoomAllocationService();
        roomAllocationService.allocateRoom(new Reservation("John Doe", "Single"), new RoomInventory("Single", 10));
    }
}