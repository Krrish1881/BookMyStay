// Use Case 9: Error Handling & Validation
import java.util.*;

class InvalidBookingException extends Exception
{
    public InvalidBookingException(String message)
    {
        super(message);
    }
}

class ReservationsValidator
{
    public void validate(
        String guestName,
        String roomType,
        RoomInventory inventory
    )throws InvalidBookingException{}
}

public class UseCase9ErrorHandlingAndValidation
{
    public static void main(String[] args)
    {
        // Create a new instance of the ReservationsValidator class
        ReservationsValidator validator = new ReservationsValidator();

        // Call the validate method with invalid inputs
        try {
            validator.validate("John Doe", "Suite", null);
        } catch (InvalidBookingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}