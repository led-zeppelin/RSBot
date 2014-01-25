package org.powerbot.script;
import org.powerbot.script.Manifest;
import org.powerbot.script.PollingScript;
@Manifest( name = "Apprehension's v1 test", description = "testing a beginner script")
public class Honeycomb extends PollingScript {
	@Override 
	public void start(){
		log.info("The script has started!");
	}
	@Override
	public int poll() {
		// TODO Auto-generated method stub
		return 0;
	}
}