package diary.seviceClient;

import diary.seviceClient.almanac.AlmanacResult;
import diary.seviceClient.almanac.AlmanacServiceLocator;
import diary.seviceClient.almanac.AlmanacServicePortType;

import java.util.Date;

/**
 * Created by admin on 2017/5/4.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          AlmanacServiceLocator locator = new AlmanacServiceLocator();
          AlmanacServicePortType service = locator.getAlmanacServiceHttpSoap12Endpoint();
          // If authorization is required
          //((AlmanacServiceSoap11BindingStub)service).setUsername("user3");
          //((AlmanacServiceSoap11BindingStub)service).setPassword("pass3");
          // invoke business method
          AlmanacResult result = service.getAlmanac(new Date());
          System.out.println(result.getResult().getJi());
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }
}
