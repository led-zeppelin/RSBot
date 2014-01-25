package org.powerbot.script.methods;
import org.powerbot.script.PollingScript;
import org.powerbot.script.methods.Bank;

public class Bank extends PollingScript {
	public void open() {
		log.info("Opened the bank!");
	}
	public boolean isOpen(){
		return true;
	}
	public int honeycomb = 12156;
	public int all = 28;
	public void deposite(){
		honeycomb++;
		all++;
	}
	@Override
	public int poll() {
		// TODO Auto-generated method stub
		return 0;
	}
}