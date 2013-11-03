package org.smarttechie;

public class SampleThreadDoubleCheckLock implements Runnable {

	@Override
	public void run() {
		SingletonDoubleCheckLock.getSingletonInstance();
	}

}
