package model.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.Hello;

public class Helloimpl extends UnicastRemoteObject implements Hello{
    public Helloimpl() throws RemoteException {
    }

    @Override
    public String welcome(String name) throws RemoteException {
        return "Hello," + name;
    }
    
}
