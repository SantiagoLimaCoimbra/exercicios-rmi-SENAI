
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject
        implements Hello {

    private static final long serialVersionUID = 1L;

    protected HelloServer() throws RemoteException {
        super();
    }

    //LOGICA DA SOMA AQUI

    @Override
    public String digaOla() throws RemoteException {
        System.out.println("Executando no servidor");
        return "Executando o método remoto: Olá";
    }

}
