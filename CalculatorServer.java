import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer extends UnicastRemoteObject implements Calculator {
    protected CalculatorServer() throws RemoteException {
        super();
    }

    @Override
    public Double calc(Double a, Double b) throws RemoteException {

        double result = a + b;

        return result;
    }
}
