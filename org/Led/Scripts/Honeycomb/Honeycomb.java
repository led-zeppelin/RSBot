package org.Led.scripts.honeycomb;
import org.powerbot.script.Manifest;
import org.powerbot.script.PollingScript;
import org.Led.scripts.honeycomb.tasks.Bank;

@Manifest( name = "Apprehension's v1 test", description = "testing a beginner script")
public class Honeycomb extends PollingScript {
	@Override 
	public void start(){
		log.info("The script has started!");
	}
	@Override
	public int poll() {
		return 0;
	}
}