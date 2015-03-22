package com.client;

import java.rmi.NotBoundException;
//import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.interf.test.Constant;
import com.interf.test.TestRemote;

public class Client_temp {
	public static void main(String[] args) throws RemoteException, NotBoundException{

		Registry registry = LocateRegistry.getRegistry("localhost", Constant.RMI_port); 
		TestRemote remote = (TestRemote) registry.lookup(Constant.RMI_ID);
		
		System.out.println("Global ID of temperature sensor is "+ remote.register("sensor","temperature"));		
	}
}