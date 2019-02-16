import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AreaIntf extends Remote {
    public float getArea( Box b )
            throws RemoteException;
}
