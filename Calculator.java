import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    //public Double calc(double a, double b) throws RemoteException;

    Double calc(Double a, Double b) throws RemoteException;
}
