package method.invocation;

import method.invocation.command.LightOnCommand;
import method.invocation.command.TVOffCommand;
import method.invocation.invoker.RemoteControl;
import method.invocation.receiver.Light;
import method.invocation.receiver.TV;

public class TestCase{
	public static void main(String[] args){
		
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		TV tv = new TV();
		TVOffCommand tvoff = new TVOffCommand(tv);
		
		RemoteControl rc = new RemoteControl();
		rc.setCommand(lightOn);
		rc.pressButton();
		
		rc.setCommand(tvoff);
		rc.pressButton();
		
		
	}
}