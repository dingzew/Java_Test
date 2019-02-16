import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.Naming;

public class AreaServer extends UnicastRemoteObject
        implements AreaIntf{
    public AreaServer() throws RemoteException{
        super(0);
    }
    public float getArea( Box b )
            throws RemoteException{
        return b.width * b.height;
    }

    public static void main(String[] args) throws Exception {
        int port = 4375;
        try { // create registry if it doesn’t exist
            LocateRegistry.createRegistry(port); // port
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        AreaServer server = new AreaServer();
        Naming.rebind("//127.0.0.1/AreaServer:" + port + "/MyService", server);
    }
}