import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Armstrong extends Remote {
    boolean isArmstrong(int number) throws RemoteException;
}
