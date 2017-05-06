package diary.seviceClient;

import diary.seviceClient.almanac.AlmanacResult;
import diary.seviceClient.almanac.AlmanacService;
import diary.seviceClient.almanac.AlmanacServiceLocator;
import diary.seviceClient.almanac.AlmanacServicePortType;
import diary.seviceClient.starSign.StarResult;
import diary.seviceClient.starSign.StarSignService;
import diary.seviceClient.starSign.StarSignServiceLocator;
import diary.seviceClient.starSign.StarSignServicePortType;

import java.util.Date;

/**
 * Created by admin on 2017/5/4.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          AlmanacService locator = new AlmanacServiceLocator();
          AlmanacServicePortType service = locator.getAlmanacServiceHttpSoap12Endpoint();
          // If authorization is required
          //((AlmanacServiceSoap11BindingStub)service).setUsername("user3");
          //((AlmanacServiceSoap11BindingStub)service).setPassword("pass3");
          // invoke business method
          //AlmanacService as = locator.
          AlmanacResult result = service.getAlmanac(new Date());
          System.out.println(result.getResult().getJi());
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }

      try {
          StarSignServiceLocator locator = new StarSignServiceLocator();
          StarSignServicePortType service = locator.getStarSignServiceHttpSoap12Endpoint();
          // If authorization is required
          //((AlmanacServiceSoap11BindingStub)service).setUsername("user3");
          //((AlmanacServiceSoap11BindingStub)service).setPassword("pass3");
          // invoke business method
          StarResult result = service.getStarSignToday("射手座");
          System.out.println(result.getAll());
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }
}
