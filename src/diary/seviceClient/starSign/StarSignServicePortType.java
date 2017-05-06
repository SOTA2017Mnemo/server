/**
 * StarSignServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package diary.seviceClient.starSign;

public interface StarSignServicePortType extends java.rmi.Remote {
    public diary.seviceClient.starSign.StarResult getStarSignToday(java.lang.String star) throws java.rmi.RemoteException;
    public diary.seviceClient.starSign.StarResult getStarSignWeek(java.lang.String star) throws java.rmi.RemoteException;
    public diary.seviceClient.starSign.StarResult getStarSignNextweek(java.lang.String star) throws java.rmi.RemoteException;
    public diary.seviceClient.starSign.StarResult getStarSignTomorrow(java.lang.String star) throws java.rmi.RemoteException;
}
