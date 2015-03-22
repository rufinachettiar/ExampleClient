package com.inter.client;

import java.rmi.RemoteException;

public interface ClientRemoteSens extends java.rmi.Remote {
	
	public String query_state(int id) throws RemoteException;
	
	
}
