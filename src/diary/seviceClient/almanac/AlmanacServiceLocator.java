/**
 * AlmanacServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package diary.seviceClient.almanac;

public class AlmanacServiceLocator extends org.apache.axis.client.Service implements diary.seviceClient.almanac.AlmanacService {

    public AlmanacServiceLocator() {
    }


    public AlmanacServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AlmanacServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AlmanacServiceHttpSoap12Endpoint
    private java.lang.String AlmanacServiceHttpSoap12Endpoint_address = "http://120.76.144.133:8080/axis2/services/AlmanacService.AlmanacServiceHttpSoap12Endpoint/";

    public java.lang.String getAlmanacServiceHttpSoap12EndpointAddress() {
        return AlmanacServiceHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AlmanacServiceHttpSoap12EndpointWSDDServiceName = "AlmanacServiceHttpSoap12Endpoint";

    public java.lang.String getAlmanacServiceHttpSoap12EndpointWSDDServiceName() {
        return AlmanacServiceHttpSoap12EndpointWSDDServiceName;
    }

    public void setAlmanacServiceHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        AlmanacServiceHttpSoap12EndpointWSDDServiceName = name;
    }

    public diary.seviceClient.almanac.AlmanacServicePortType getAlmanacServiceHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AlmanacServiceHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAlmanacServiceHttpSoap12Endpoint(endpoint);
    }

    public diary.seviceClient.almanac.AlmanacServicePortType getAlmanacServiceHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            diary.seviceClient.almanac.AlmanacServiceSoap12BindingStub _stub = new diary.seviceClient.almanac.AlmanacServiceSoap12BindingStub(portAddress, this);
            _stub.setPortName(getAlmanacServiceHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAlmanacServiceHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        AlmanacServiceHttpSoap12Endpoint_address = address;
    }


    // Use to get a proxy class for AlmanacServiceHttpSoap11Endpoint
    private java.lang.String AlmanacServiceHttpSoap11Endpoint_address = "http://120.76.144.133:8080/axis2/services/AlmanacService.AlmanacServiceHttpSoap11Endpoint/";

    public java.lang.String getAlmanacServiceHttpSoap11EndpointAddress() {
        return AlmanacServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AlmanacServiceHttpSoap11EndpointWSDDServiceName = "AlmanacServiceHttpSoap11Endpoint";

    public java.lang.String getAlmanacServiceHttpSoap11EndpointWSDDServiceName() {
        return AlmanacServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setAlmanacServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        AlmanacServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public diary.seviceClient.almanac.AlmanacServicePortType getAlmanacServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AlmanacServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAlmanacServiceHttpSoap11Endpoint(endpoint);
    }

    public diary.seviceClient.almanac.AlmanacServicePortType getAlmanacServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            diary.seviceClient.almanac.AlmanacServiceSoap11BindingStub _stub = new diary.seviceClient.almanac.AlmanacServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getAlmanacServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAlmanacServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        AlmanacServiceHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (diary.seviceClient.almanac.AlmanacServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                diary.seviceClient.almanac.AlmanacServiceSoap12BindingStub _stub = new diary.seviceClient.almanac.AlmanacServiceSoap12BindingStub(new java.net.URL(AlmanacServiceHttpSoap12Endpoint_address), this);
                _stub.setPortName(getAlmanacServiceHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
            if (diary.seviceClient.almanac.AlmanacServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                diary.seviceClient.almanac.AlmanacServiceSoap11BindingStub _stub = new diary.seviceClient.almanac.AlmanacServiceSoap11BindingStub(new java.net.URL(AlmanacServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getAlmanacServiceHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AlmanacServiceHttpSoap12Endpoint".equals(inputPortName)) {
            return getAlmanacServiceHttpSoap12Endpoint();
        }
        else if ("AlmanacServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getAlmanacServiceHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://almanac", "AlmanacService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://almanac", "AlmanacServiceHttpSoap12Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://almanac", "AlmanacServiceHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AlmanacServiceHttpSoap12Endpoint".equals(portName)) {
            setAlmanacServiceHttpSoap12EndpointEndpointAddress(address);
        }
        else 
if ("AlmanacServiceHttpSoap11Endpoint".equals(portName)) {
            setAlmanacServiceHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
