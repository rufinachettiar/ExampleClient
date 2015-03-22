package com.client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

//import com.inter.client.ClientRemote;
import com.inter.client.ClientRemoteSens;

public class Client_Impl_sens extends UnicastRemoteObject implements ClientRemoteSens {
	String outlet_state;
	String bulb_state;
	String motion_state;

protected Client_Impl_sens() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

public String query_state(int id) {
		
		switch(id){
		
		//temperature is randomly chosen between -10 C and 15 C
		case 1:
			int START = -10;
			int END = 15;
			Random random = new Random();

		      Integer x = showRandomInteger(START, END, random);
		      x.toString().concat("- id ->" + id);
		      
			return x.toString();

		//motion is randomly chosen yes or no
		case 2:
			Random mot = new Random();			
			int Mot = mot.nextInt(2);

			if(String.valueOf(Mot).equals("1"))
				motion_state = "YES";
			else motion_state = "NO";
						
			return motion_state;
					
		//outlet device's state is randomly chosen on or off      
		case 3:
			Random otlet = new Random();			
			int Otlet = otlet.nextInt(2);

			if(String.valueOf(Otlet).equals("1"))
			    outlet_state = "ON";
			else outlet_state = "OFF";
						
			return outlet_state;
		
		//bulb's state is based on motion state 
		case 4:
			Random bul = new Random();			
			int Bul = bul.nextInt(2);

			if(String.valueOf(Bul).equals("1"))
				bulb_state = "ON";
			else bulb_state = "OFF";
						
			return bulb_state;
		}
				
		return " ";
	}

	//random number generator function to report current temperature
	private int showRandomInteger(int aStart, int aEnd, Random aRandom) {		
		    if (aStart > aEnd) {
		      throw new IllegalArgumentException("Start cannot exceed End.");
		    }	
		    long range = (long)aEnd - (long)aStart + 1;
		   
		    long fraction = (long)(range * aRandom.nextDouble());
		    int randomNumber =  (int)(fraction + aStart);    
		    return randomNumber;
		  }
	
}
