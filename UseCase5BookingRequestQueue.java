// Use Case 5: Booking Request (First-Come-First-Served)
import java.util.*;

class Reservation
{
    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) 
    {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() 
    {
        return guestName;
    }

    public String getRoomType() 
    {
        return roomType;
    }
}

class BookingRequestQueue
{
    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() 
    {
        requestQueue = new LinkedList<>();
    }

    public void addReservation(Reservation reservation) 
    {
        requestQueue.offer(reservation);
    }

    public Reservation getNextReservation() 
    {
        return requestQueue.poll();
    }

    public boolean hasPendingReservations() 
    {
        return !requestQueue.isEmpty();
    }

    public Reservation poll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'poll'");
    }
}

public class UseCase5BookingRequestQueue 
{
    public static void main(String[] args) 
    {
        System.out.println("Booking Request Queue: First-Come-First-Served");
        
        BookingRequestQueue requestQueue = new BookingRequestQueue();
        requestQueue.addReservation(new Reservation("John Doe", "Single"));
        requestQueue.addReservation(new Reservation("Jane Smith", "Double"));
        requestQueue.addReservation(new Reservation("Bob Johnson", "Suite"));
        
        while (requestQueue.hasPendingReservations()) 
        {
            Reservation reservation = requestQueue.getNextReservation();
            System.out.println("Guest: " + reservation.getGuestName() + ", Room Type: " + reservation.getRoomType());
        }
    }
}