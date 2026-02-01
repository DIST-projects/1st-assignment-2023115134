import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ArmstrongImpl extends UnicastRemoteObject implements Armstrong {

    protected ArmstrongImpl() throws RemoteException {
        super(2001); // fixed RMI object port
    }

    public boolean isArmstrong(int number) throws RemoteException {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int rem = number % 10;
            sum += Math.pow(rem, digits);
            number /= 10;
        }
        return sum == original;
    }
}
