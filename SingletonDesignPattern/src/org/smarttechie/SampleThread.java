package org.smarttechie;

public class SampleThread implements Runnable {

	@Override
	public void run() {
		SingletonDoubleCheckLock.getSingletonInstance();
	}

}
