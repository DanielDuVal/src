package proxy;

public class LostSignalState implements State{

	private static final long serialVersionUID = 2L;
	Phone phone;

	public LostSignalState(Phone phone) {
		this.phone = phone;
	}

	public boolean initiateCall() {
		System.out.println("Cannot initiate. No signal.");
		boolean success = false;
		return success;
	}

	public boolean dial() {
		System.out.println("Cannot dial. No signal.");
		boolean success = false;
		return success;
	}

	public boolean callStatus() {
		System.out.println("Call ended. Lost signal.");
		boolean success = false;
		return success;
	}

	public boolean endCall() {
		System.out.println("Call ended.");
		boolean success = false;
		return success;
	}
}
