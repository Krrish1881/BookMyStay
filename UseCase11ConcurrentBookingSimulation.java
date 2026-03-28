// Use Case 11: Concurrent Booking Simulation (Thread Safety)

import java.util.*;

class ConcurrentBookingProcessor implements Runnable 
{
    private BookingRequestQueue requestQueue;
    private RoomInventory inventory;
    private RoomAllocationService allocationService;

    public ConcurrentBookingProcessor(BookingRequestQueue requestQueue, RoomInventory inventory, RoomAllocationService allocationService) 
    {
        this.requestQueue = requestQueue;
        this.inventory = inventory;
        this.allocationService = allocationService;
    }
    @Override
    public void run() 
    {
        while (true) 
        {
            Reservatoin reservation;

            synchronized (bookingQueue) 
            {
                reservation = requestQueue.poll();
            }
            synchronized (invertory)
            {
                allocationService.allocateRoom(reservation, invertory);
            }
        }
    }
}

public class UseCase11ConcurrentBookingSimulation
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new ConcurrentBookingProcessor(bookingQueue, inventory, allocationService));
        Thread t2 = new Thread(new ConcurrentBookingProcessor(bookingQueue, inventory, allocationService));
        t1.start();
        t2.start();

        try 
        {
            t1.join();
            t2.join();
        } catch (InterruptedException e) 
        {
           System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}