package org.Led.scripts.honeycomb.tasks;
import org.powerbot.script.AbstractScript;

public class Bank extends AbstractScript {
	public void open() {
		log.info("We have opened the bank!");
	}
	public boolean isOpen(){
		return ctx.widgets.get(11, 1).isOnScreen();
	}
	public int honeycomb = 12156;
	public int all = 28;
	public void deposite(){
		honeycomb++;
		all++;
	}
	@Override
	public void run() {
	}

}