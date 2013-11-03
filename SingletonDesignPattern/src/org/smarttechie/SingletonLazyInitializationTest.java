package org.smarttechie;

public class SingletonLazyInitializationTest {

	public static void main(String[] args) {
		SampleThread s1 = new SampleThread();
		SampleThread s2 = new SampleThread();
		Thread t = new Thread(s1);
	    Thread u = new Thread(s2);
	    t.start();
	    u.start();
	}
}
