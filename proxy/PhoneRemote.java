package proxy;

	import java.rmi.*;

	public interface PhoneRemote extends Remote{
		
			public int getBars() throws RemoteException;
			public String getLocation() throws RemoteException;
		public State getState() throws RemoteException;
	}
