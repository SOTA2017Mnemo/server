/**
 * AlmanacService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package diary.seviceClient.almanac;

public interface AlmanacService extends javax.xml.rpc.Service {
    public java.lang.String getAlmanacServiceHttpSoap12EndpointAddress();

    public diary.seviceClient.almanac.AlmanacServicePortType getAlmanacServiceHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException;

    public diary.seviceClient.almanac.AlmanacServicePortType getAlmanacServiceHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getAlmanacServiceHttpSoap11EndpointAddress();

    public diary.seviceClient.almanac.AlmanacServicePortType getAlmanacServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public diary.seviceClient.almanac.AlmanacServicePortType getAlmanacServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
