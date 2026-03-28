// Use Case 12: Data Persistence & System Recovery
import java.util.*;

class FilePersistenceService
{
    public void saveInventory(RoomInventory inventory, String fileName)
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            oos.writeObject(inventory);
            System.out.println("Inventory saved successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error saving inventory: " + e.getMessage());
        }
    }

    public void loadInventory(RoomInventory inventory, String fileName)
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)))
        {
            RoomInventory loaded = (RoomInventory) ois.readObject();
            inventory.setRoomType(loaded.getRoomType());
            inventory.setCount(loaded.getCount());
            System.out.println("Inventory loaded successfully.");
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Error loading inventory: " + e.getMessage());
        }
    }
}

public class UseCase12DataPersistenceRecovery
{
    public static void main(String[] args)
    {
         FilePersistenceService service = new FilePersistenceService();

        // Create inventory
        RoomInventory inventory = new RoomInventory("Single", 10);

        // Save data
        service.saveInventory(inventory, "inventory.dat");

        // Simulate system restart (new object)
        RoomInventory recoveredInventory = new RoomInventory("", 0);

        // Load data
        service.loadInventory(recoveredInventory, "inventory.dat");

        // Display recovered data
        System.out.println("Recovered Data:");
        recoveredInventory.display();
    }
}