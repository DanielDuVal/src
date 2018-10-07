package proxy;

	public interface State {
		
		public boolean initiateCall();
		public boolean dial();
		public boolean callStatus();
		public boolean endCall();
	}
