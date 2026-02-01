import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ArmstrongClient {
    public static void main(String[] args) {
        try {
           // Replace with Azure VM Public IP when running the server
            String serverIP = "<AZURE_VM_PUBLIC_IP>";


            Registry registry = LocateRegistry.getRegistry(serverIP, 1099);
            Armstrong stub = (Armstrong) registry.lookup("ArmstrongService");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (stub.isArmstrong(num))
                System.out.println(num + " is an Armstrong number");
            else
                System.out.println(num + " is NOT an Armstrong number");

            sc.close();
        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }
    }
}
