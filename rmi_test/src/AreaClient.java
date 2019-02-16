import java.rmi.Naming;

public class AreaClient {

    public static void main(String[] args) throws Exception {
        int port = 4375;
        Box b = new Box();
        b.height = 4;
        b.width = 4;
        AreaIntf srv= (AreaIntf)
                Naming.lookup("//127.0.0.1/AreaServer:" + port + "/MyService");
        float f = srv.getArea(b);
        System.out.println(f);
    }
}
