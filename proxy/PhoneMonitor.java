package proxy;

	import java.rmi.*;

	public class PhoneMonitor {

			Phone phone;
			int bars;
			State state;
		 
			public PhoneMonitor(Phone phone) {
				this.phone = phone;
			}
		 
			public void report() throws RemoteException {
				try {
					System.out.println("Phone: " + phone.getLocation());
					System.out.println("Signal strength " + phone.getBars() + " bars");
					System.out.println("Current state: " + phone.getState());
				} catch (RemoteException e) {
					e.printStackTrace();
				}
				bars = phone.getBars();
				state = phone.getState();
			}
			
			public int bars() {
				return bars;
			}
			
			public State getState() {
				return state;
			}
	}
