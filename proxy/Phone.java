package proxy;

	import java.rmi.*;
	import java.rmi.server.*;

	public class Phone extends UnicastRemoteObject implements PhoneRemote{

		private static final long serialVersionUID = 2L;
		State hasSignalState;
		State lostSignalState;
		State noSignalState;
		
		State state;
		int bars = 5;														//refers to the number of bars your phone has (signal strength).
		String location;
		
		public Phone(String location, int numberOfBars) throws RemoteException{
			hasSignalState = new HasSignalState(this);
			lostSignalState = new LostSignalState(this);
			noSignalState = new NoSignalState(this);
			
			this.bars = numberOfBars;
			if(numberOfBars > 0)
				state = hasSignalState;
			else state = noSignalState;
			
			this.location = location;
		}
		
		public boolean initiateCall(){
			state.initiateCall();
			if(state.initiateCall() == true) {
				state.dial();
				return true;
			}
			else return false;
		}
		
		public boolean dial() {
			state.dial();
			if(state.dial() == true) {
				state.callStatus();
				return true;
			}
			else return false;
		}
		
		public boolean callStatus() {
			state.callStatus();
			if(state.callStatus() == true)
				return true;
			else return false;
		}
		
		public boolean endCall() {
			state.endCall();
			if(state.endCall() == true)
				return true;
			else return false;
		}
		
		public int getBars() {
			return bars;
		}
		
		public void setBars(int bars) {
			this.bars = bars;
		}
		
		public void setState(State state) {
			this.state = state;
		}

		public String getLocation() throws RemoteException {
			return location;
		}

		public State getState() throws RemoteException {
			return state;
		}
	}