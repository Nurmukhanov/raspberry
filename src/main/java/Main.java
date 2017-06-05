import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import java.io.IOException;

/**
 * Created by olzhas on 06.06.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        RemoteDevice[] rdList = LocalDevice.getLocalDevice().getDiscoveryAgent().retrieveDevices(DiscoveryAgent.PREKNOWN);
        for (int i=0; i<rdList.length; i++){
            System.out.println(rdList[i].getBluetoothAddress());
            System.out.println(rdList[i].getFriendlyName(true));
        }
    }
}
