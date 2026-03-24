// Use Case 10: Booking Cancellation & Inventory Rollback
import java.util.*;

class CancellationService 
{
    private Stack<String> releasedRoomsIds;
    private Map<String, String> reservationRoomTypeMap;

    public CancellationService() 
    {
        releasedRoomsIds = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    public void registerBooking(String reservationId, String roomType) 
    {
        releasedRoomsIds.push(reservationId);
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    public void cancelBooking(String reservationId, RoomInventory inventory)
    {
        String roomType = reservationRoomTypeMap.get(reservationId);
        inventory.updateRoomAvailability(roomType, 1);
        releasedRoomsIds.remove(reservationId);
    }
    public void showRollbackHistory() 
    {
        System.out.println("Rollback History:");
        for (String reservationId : releasedRoomsIds) 
        {
            String roomType = reservationRoomTypeMap.get(reservationId);
            System.out.println("Reservation ID: " + reservationId + ", Room Type: " + roomType);
        }
    }
}

public class UseCase10BookingCancellationAndInventoryRollback 
{
    public static void main(String[] args) 
    {
        RoomInventory inventory = new RoomInventory("Single", 10);
        CancellationService cancellationService = new CancellationService();
        cancellationService.registerBooking("Reservation1", "Single");
        cancellationService.registerBooking("Reservation2", "Double");
        cancellationService.cancelBooking("Reservation1", inventory);
        cancellationService.showRollbackHistory();
    }
}