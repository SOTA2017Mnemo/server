package diary.seviceClient;

import diary.seviceClient.starSign.StarResult;
import diary.seviceClient.starSign.StarSignServiceLocator;
import diary.seviceClient.starSign.StarSignServicePortType;

/**
 * Created by admin on 2017/5/6.
 */
public class StarSignClient {

    public static String getColor(String starSign){
        try {
            StarSignServiceLocator locator = new StarSignServiceLocator();
            StarSignServicePortType service = locator.getStarSignServiceHttpSoap12Endpoint();
            StarResult result = service.getStarSignToday("射手座");
            return result.getColor();
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
