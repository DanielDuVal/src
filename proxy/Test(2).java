package proxy;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.RemoteException;

class Test {

	@org.junit.jupiter.api.Test
	void test() throws RemoteException {
		
		Phone phone = new Phone("1st Floor", 4);
		PhoneMonitor monitor = new PhoneMonitor(phone);
		assertEquals(4, phone.getBars());
		
		monitor.report();
		assertEquals(4, monitor.bars());
		assertEquals(phone.getState(), monitor.getState());
		
		NoSignalState noSignal = new NoSignalState(phone);
		phone.setState(noSignal);
		phone.setBars(1);
		
		monitor.report();
		assertEquals(1, monitor.bars());
		assertEquals(phone.getState(), monitor.getState());
	}
}
