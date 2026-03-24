// Use Case 8: Booking History & Reporting
import java.util.*;

class BookingHistory
{
    private List<Reservation> confirmedReservations;
    public BookingHistory() 
    {
        confirmedReservations = new ArrayList<>(); // List to store confirmed reservations
    }

    public void addReservation(Reservation reservation) 
    {
        confirmedReservations.add(reservation);
    }

    public List<Reservation> getConfirmedReservations() 
    {
        return confirmedReservations;
    }
}

class BookingReportService
{
    public void generateReport(BookingHistory bookingHistory) 
    {
        List<Reservation> confirmedReservations = bookingHistory.getConfirmedReservations();
        // Generate report based on confirmed reservations
    }
}

public class UseCase8BookingHistoryReport 
{
    public static void main(String[] args) 
    {
        BookingHistory bookingHistory = new BookingHistory();
        bookingHistory.addReservation(new Reservation("John Doe", "Single"));
        bookingHistory.addReservation(new Reservation("Jane Smith", "Double"));
        
        BookingReportService reportService = new BookingReportService();
        reportService.generateReport(bookingHistory);
    }
}