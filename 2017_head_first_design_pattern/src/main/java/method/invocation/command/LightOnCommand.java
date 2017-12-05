package method.invocation.command;

import method.invocation.receiver.Light;

public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}

	public void execute() {
		light.lightOn();
		
	}
	


}
