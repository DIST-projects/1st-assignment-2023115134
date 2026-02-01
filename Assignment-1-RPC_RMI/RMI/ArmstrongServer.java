import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ArmstrongServer {
    public static void main(String[] args) {
        try {
            Armstrong obj = new ArmstrongImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ArmstrongService", obj);

            System.out.println("Armstrong RMI Server is running...");
        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
    }
}
