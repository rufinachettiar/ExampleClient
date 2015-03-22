package com.inter.client;

import java.rmi.RemoteException;

public interface ClientRemote extends java.rmi.Remote {
	
//	public String query_state(int id) throws RemoteException;
	public String change_state(int id, String state) throws RemoteException;
	
	
}
