package proxy;

	public class NoSignalState implements State{
		
		private static final long serialVersionUID = 2L;
		Phone phone;

		public NoSignalState(Phone phone) {
			this.phone = phone;
		}

		public boolean initiateCall() {
			System.out.println("No signal.");
			boolean success = false;
			return success;
		}

		public boolean dial() {
			System.out.println("No signal.");
			boolean success = false;
			return success;
		}

		public boolean callStatus() {
			System.out.println("No signal.");
			boolean success = false;
			return success;
		}

		public boolean endCall() {
			System.out.println("No signal.");
			boolean success = false;
			return success;
		}
	}
