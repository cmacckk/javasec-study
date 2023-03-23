package com.cmacckk.security.rmisec;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMITestImpl extends UnicastRemoteObject implements RMITestInterface {
    private static final long serialVersionUID = 1L;

    protected RMITestImpl() throws Exception {
        super();
    }

    @Override
    public String test() throws RemoteException {
        return "Hello World!";
    }
}
