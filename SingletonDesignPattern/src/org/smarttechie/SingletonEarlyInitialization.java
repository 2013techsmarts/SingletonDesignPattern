package org.smarttechie;

public class SingletonEarlyInitialization {

	private static SingletonEarlyInitialization singletonInstance = new SingletonEarlyInitialization();

	private SingletonEarlyInitialization() {
		System.out.println("==Instance created==");
	}

	// Providing Global point of access
	public static SingletonEarlyInitialization getSingletonInstance() {
		System.out.println("==Get instance called ==");
		return singletonInstance;
	}

}
