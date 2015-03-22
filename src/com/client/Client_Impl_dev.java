package com.client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.inter.client.ClientRemote;

public class Client_Impl_dev extends UnicastRemoteObject implements ClientRemote{

	private static final long serialVersionUID = 1L;
	String outlet_state;
	String bulb_state;
	String motion_state;

	protected Client_Impl_dev() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//change_state method defined for bulb and outlet devices
	public String change_state(int id, String state) throws RemoteException {	
		
		switch(id){
		case 3:
			if (state.equalsIgnoreCase("OFF")) 
				return outlet_state = state;				

			else if(state.equalsIgnoreCase("ON"))
				return outlet_state = state;
		
		case 4:
			if (state.equalsIgnoreCase("OFF")) 
				return bulb_state = state;				

			else if(state.equalsIgnoreCase("ON"))
				return bulb_state = state;
		}
		return " ";
	}
}
