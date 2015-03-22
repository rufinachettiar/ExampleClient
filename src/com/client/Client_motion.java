package com.client;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import com.interf.test.Constant;
import com.interf.test.TestRemote;

//****************** Motion Sensor *********************//
public class Client_motion {
	public static void main(String[] args) throws RemoteException, NotBoundException, AlreadyBoundException{
		
		String mode;
		
		Client_Impl_sens implSens =new Client_Impl_sens();
		
		Registry sens_register = LocateRegistry.createRegistry(2007);
		sens_register.bind(Constant.RMI_ID, implSens);
		
		Registry registry1 = LocateRegistry.getRegistry("localhost", Constant.RMI_port); 
		TestRemote remote = (TestRemote) registry1.lookup(Constant.RMI_ID);
		
		Scanner user_info   = new Scanner(System.in);
			
		//Global ID of motion sensor
		int motionID = remote.register("sensor","motion");
		System.out.println("Global ID of motion sensor is "+ motionID + "\n");	
	}
}