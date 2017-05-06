package diary.seviceClient;

import diary.seviceClient.almanac.AlmanacResult;
import diary.seviceClient.almanac.AlmanacService;
import diary.seviceClient.almanac.AlmanacServiceLocator;
import diary.seviceClient.almanac.AlmanacServicePortType;

import java.util.Date;

/**
 * Created by admin on 2017/5/6.
 */
public class AlmanacClient {
    public static String getJI(){
        try {
            AlmanacService locator = new AlmanacServiceLocator();
            AlmanacServicePortType service = locator.getAlmanacServiceHttpSoap12Endpoint();
            // If authorization is required
            //((AlmanacServiceSoap11BindingStub)service).setUsername("user3");
            //((AlmanacServiceSoap11BindingStub)service).setPassword("pass3");
            // invoke business method
            //AlmanacService as = locator.
            AlmanacResult result = service.getAlmanac(new Date());
            return result.getResult().getJi();
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
