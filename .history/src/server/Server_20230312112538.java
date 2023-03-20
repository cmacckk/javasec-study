package server;

import java.net.BindException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import model.impl.Helloimpl;
import model.Hello;

public class Server {
    public static void main(String[] args) throws RemoteException, NotBoundException{
        // 创建对象
        Hello hello = new Helloimpl();
        // 创建注册表
        Registry registry = LocateRegistry.createRegistry(1099);
        // 绑定对象到注册表，并给他取名为hello
        registry.bind("hello", hello);
    }
}
