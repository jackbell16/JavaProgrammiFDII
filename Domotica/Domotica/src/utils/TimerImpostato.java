/**
 * Questa classe ha il ruolo del ConcreteSubject per l'implementazione dell'obsersable
 * 
 */
package utils;

import java.util.TimerTask;

public class TimerImpostato extends Subject {
	private static int defaultDelay = 2000;
	private int delay;
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		if(delay>0)
		this.delay = delay;
		else{
			this.delay = defaultDelay ;
		}
	}

	public void setState() {
		 java.util.Timer timer = new java.util.Timer();
			TimerTask task = new TimerTask() {
				@Override
				public void run() {
					notifyObservers();
					}
			};
			timer.schedule(task, 0, delay);
		}
	
}
	

