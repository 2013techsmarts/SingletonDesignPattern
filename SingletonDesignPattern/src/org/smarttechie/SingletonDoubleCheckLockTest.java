package org.smarttechie;

public class SingletonDoubleCheckLockTest {

	public static void main(String[] args) {
		SampleThreadDoubleCheckLock s1 = new SampleThreadDoubleCheckLock();
		SampleThreadDoubleCheckLock s2 = new SampleThreadDoubleCheckLock();
		Thread t = new Thread(s1);
	    Thread u = new Thread(s2);
	    t.start();
	    u.start();
	}
}
