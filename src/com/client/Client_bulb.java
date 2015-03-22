package com.client;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.interf.test.TestRemote;

public class Client_bulb {
		public static void main(String[] args) throws RemoteException, NotBoundException, AlreadyBoundException{

			//Client_Impl_dev implDev =new Client_Impl_dev();
			
			Registry registry1 = LocateRegistry.getRegistry("localhost", 2001); 
			TestRemote remote = (TestRemote) (registry1.lookup("localhost"));
			
		//	Registry registr = LocateRegistry.getRegistry("localhost", 2005); 
			//ClientRemote remoteDe = (ClientRemote) (registr.lookup("localhost"));
			
						
			System.out.println(remote.register("device","bulb"));
	}
}
