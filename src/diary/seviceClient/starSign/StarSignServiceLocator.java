/**
 * StarSignServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package diary.seviceClient.starSign;

public class StarSignServiceLocator extends org.apache.axis.client.Service implements diary.seviceClient.starSign.StarSignService {

    public StarSignServiceLocator() {
    }


    public StarSignServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StarSignServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StarSignServiceHttpSoap11Endpoint
    private java.lang.String StarSignServiceHttpSoap11Endpoint_address = "http://120.76.144.133:8080/axis2/services/StarSignService.StarSignServiceHttpSoap11Endpoint/";

    public java.lang.String getStarSignServiceHttpSoap11EndpointAddress() {
        return StarSignServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StarSignServiceHttpSoap11EndpointWSDDServiceName = "StarSignServiceHttpSoap11Endpoint";

    public java.lang.String getStarSignServiceHttpSoap11EndpointWSDDServiceName() {
        return StarSignServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setStarSignServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        StarSignServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public diary.seviceClient.starSign.StarSignServicePortType getStarSignServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StarSignServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStarSignServiceHttpSoap11Endpoint(endpoint);
    }

    public diary.seviceClient.starSign.StarSignServicePortType getStarSignServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            diary.seviceClient.starSign.StarSignServiceSoap11BindingStub _stub = new diary.seviceClient.starSign.StarSignServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getStarSignServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStarSignServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        StarSignServiceHttpSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for StarSignServiceHttpSoap12Endpoint
    private java.lang.String StarSignServiceHttpSoap12Endpoint_address = "http://120.76.144.133:8080/axis2/services/StarSignService.StarSignServiceHttpSoap12Endpoint/";

    public java.lang.String getStarSignServiceHttpSoap12EndpointAddress() {
        return StarSignServiceHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StarSignServiceHttpSoap12EndpointWSDDServiceName = "StarSignServiceHttpSoap12Endpoint";

    public java.lang.String getStarSignServiceHttpSoap12EndpointWSDDServiceName() {
        return StarSignServiceHttpSoap12EndpointWSDDServiceName;
    }

    public void setStarSignServiceHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        StarSignServiceHttpSoap12EndpointWSDDServiceName = name;
    }

    public diary.seviceClient.starSign.StarSignServicePortType getStarSignServiceHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StarSignServiceHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStarSignServiceHttpSoap12Endpoint(endpoint);
    }

    public diary.seviceClient.starSign.StarSignServicePortType getStarSignServiceHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            diary.seviceClient.starSign.StarSignServiceSoap12BindingStub _stub = new diary.seviceClient.starSign.StarSignServiceSoap12BindingStub(portAddress, this);
            _stub.setPortName(getStarSignServiceHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStarSignServiceHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        StarSignServiceHttpSoap12Endpoint_address = address;
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
            if (diary.seviceClient.starSign.StarSignServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                diary.seviceClient.starSign.StarSignServiceSoap11BindingStub _stub = new diary.seviceClient.starSign.StarSignServiceSoap11BindingStub(new java.net.URL(StarSignServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getStarSignServiceHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (diary.seviceClient.starSign.StarSignServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                diary.seviceClient.starSign.StarSignServiceSoap12BindingStub _stub = new diary.seviceClient.starSign.StarSignServiceSoap12BindingStub(new java.net.URL(StarSignServiceHttpSoap12Endpoint_address), this);
                _stub.setPortName(getStarSignServiceHttpSoap12EndpointWSDDServiceName());
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
        if ("StarSignServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getStarSignServiceHttpSoap11Endpoint();
        }
        else if ("StarSignServiceHttpSoap12Endpoint".equals(inputPortName)) {
            return getStarSignServiceHttpSoap12Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://star", "StarSignService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://star", "StarSignServiceHttpSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://star", "StarSignServiceHttpSoap12Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StarSignServiceHttpSoap11Endpoint".equals(portName)) {
            setStarSignServiceHttpSoap11EndpointEndpointAddress(address);
        }
        else 
if ("StarSignServiceHttpSoap12Endpoint".equals(portName)) {
            setStarSignServiceHttpSoap12EndpointEndpointAddress(address);
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
