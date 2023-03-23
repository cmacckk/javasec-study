package com.cmacckk.security.rmisec;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMITestInterface extends Remote {
    String test() throws RemoteException;
}
