package client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import model.Hello;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        // 获取到注册表的代理
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        // 利用注册表的代理去查询远程注册表中名为hello的对象
        Hello hello = (Hello) registry.lookup("hello")
    }
}
