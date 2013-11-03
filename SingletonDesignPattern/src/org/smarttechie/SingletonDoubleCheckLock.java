package org.smarttechie;

public class SingletonDoubleCheckLock {

	private static SingletonDoubleCheckLock singletonInstance;

	private SingletonDoubleCheckLock() {
		System.out.println("==Instance created==");
	}

	// Providing Global point of access
	public static SingletonDoubleCheckLock getSingletonInstance() {
		if (null == singletonInstance) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			synchronized (SingletonDoubleCheckLock.class){
				if (null == singletonInstance) {
					singletonInstance = new SingletonDoubleCheckLock();
				}
			}
		}
		System.out.println("==Get instance called ==");
		return singletonInstance;
	}

}
