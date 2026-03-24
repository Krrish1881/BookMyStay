// Use Case 2: Basic Room Types & Static Availability

import java.util.*;
abstract class Room 
{
    private int numberofBeds;
    private int squareFeet;
    private int pricePerNight;
    private String type;
    private String availability;
    private String roomNumber;

    public Room(int numberofBeds, int squareFeet, int pricePerNight, String type, String availability, String roomNumber)
    {
        this.numberofBeds = numberofBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
        this.type = type;
        this.availability = availability;
        this.roomNumber = roomNumber;
    }

    public void displayRoomDetails()
    {
        System.out.println("Number of Beds: " + numberofBeds);
        System.out.println("Square Feet: " + squareFeet);
        System.out.println("Price Per Night: " + pricePerNight);
        System.out.println("Type: " + type);
        System.out.println("Availability: " + availability);
        System.out.println("Room Number: " + roomNumber);
    }
}

class SingleRoom extends Room
{
    public SingleRoom()
    {
        super(1, 250, 1500, "Single", "Available", "S1");
    }
}

class DoubleRoom extends Room
{
    public DoubleRoom()
    {
        super(2, 400, 2500, "Double", "Available", "D1");
    }
}

class SuiteRoom extends Room
{
    public SuiteRoom()
    {
        super(4, 600, 5000, "Suite", "Available", "S2");
    }
}

public class UseCase2RoomInitialization
{
    public static void main(String[] args)
    {
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suiteRoom = new SuiteRoom();

        singleRoom.displayRoomDetails();
        doubleRoom.displayRoomDetails();
        suiteRoom.displayRoomDetails();
    }
}