package org.smarttechie;

public class SingletonEarlyInitializationTest {

	public static void main(String[] args) {
		SampleThread s1 = new SampleThread();
		SampleThread s2 = new SampleThread();
		Thread t = new Thread(s1);
	    Thread u = new Thread(s2);
	    t.start();
	    u.start();
		/*SingletonEarlyInitialization.getSingletonInstance();
		SingletonEarlyInitialization.getSingletonInstance();
		SingletonEarlyInitialization.getSingletonInstance();
		SingletonEarlyInitialization.getSingletonInstance();*/
	}
}
