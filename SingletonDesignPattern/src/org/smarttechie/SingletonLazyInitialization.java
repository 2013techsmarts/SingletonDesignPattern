package org.smarttechie;

public class SingletonLazyInitialization {

	private static SingletonLazyInitialization singletonInstance;

	private SingletonLazyInitialization() {
		System.out.println("==Instance created==");
	}

	// Providing Global point of access
	public static SingletonLazyInitialization getSingletonInstance() {
		if (null == singletonInstance) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			singletonInstance = new SingletonLazyInitialization();
		}
		System.out.println("==Get instance called ==");
		return singletonInstance;
	}

}
