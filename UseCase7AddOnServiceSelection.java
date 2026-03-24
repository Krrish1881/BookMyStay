// Use Case 7: Add-On Service Selection
import java.util.*;

class AddOnService
{
    private String name;
    private double cost;

    public AddOnService(String name, double cost) 
    {
        this.name = name;
        this.cost = cost;
    }

    public String getServiveName() 
    {
        return name;
    }

    public double getCost() 
    {
        return cost;
    }
}

class AddOnServiceManager
{
    private Map<String, List<AddOnService>> serviceByReservation;

    public AddOnServiceManager() 
    {
        serviceByReservation = new HashMap<>();
    }

    public void addService(String reservationId, AddOnService service) 
    {
        List<AddOnService> services = serviceByReservation.getOrDefault(reservationId, new ArrayList<>());
        services.add(service);
        serviceByReservation.put(reservationId, services);
    }

    public double getTotalCost(String reservationId) 
    {
        List<AddOnService> services = serviceByReservation.getOrDefault(reservationId, new ArrayList<>());
        double totalCost = 0;
        for (AddOnService service : services) 
        {
            totalCost += service.getCost();
        }
        return totalCost;
    }
}

public class UseCase7AddOnServiceSelection 
{
    public static void main(String[] args) 
    {
        AddOnServiceManager addOnServiceManager = new AddOnServiceManager();
        addOnServiceManager.addService("Reservation1", new AddOnService("Spa", 50.0));
        addOnServiceManager.addService("Reservation1", new AddOnService("Massage", 100.0));
        addOnServiceManager.addService("Reservation2", new AddOnService("Gym", 75.0));
        System.out.println("Total cost for Reservation1: " + addOnServiceManager.getTotalCost("Reservation1")); // Output: 150.0
        System.out.println("Total cost for Reservation2: " + addOnServiceManager.getTotalCost("Reservation2")); // Output: 75.0
    }
}