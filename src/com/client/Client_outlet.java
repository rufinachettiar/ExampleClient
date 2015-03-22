package com.client;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.interf.test.Constant;
import com.interf.test.TestRemote;

//****************** Outlet Device *********************//
public class Client_outlet {
	public static void main(String[] args) throws RemoteException, NotBoundException, AlreadyBoundException{

		Client_Impl_dev implDev =new Client_Impl_dev();

		Registry dev_register = LocateRegistry.createRegistry(2005);
		dev_register.bind(Constant.RMI_ID, implDev);
		
		Registry registry = LocateRegistry.getRegistry("localhost", 2001); 
		TestRemote remote = (TestRemote) (registry.lookup("localhost"));
		
		//Global ID of Outlet Device
		System.out.println("Global ID of outlet device is "+ remote.register("device","outlet"));
		
	}
}