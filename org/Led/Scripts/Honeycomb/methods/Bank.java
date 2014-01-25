package org.powerbot.script.methods;
import org.powerbot.script.Manifest;
import org.powerbot.script.PollingScript;
import org.powerbot.script.methods.Bank;
import org.powerbot.script.util.Random;
@Manifest( name = "Apprehension's v1 test", description = "testing a beginner script")
public class Bank extends PollingScript {
        public void open() {
                log.info("Opened the bank!");
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
		public int poll() {
			// TODO Auto-generated method stub
			return Random.nextInt(300, 900);
		}
}