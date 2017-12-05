package method.invocation.invoker;

import method.invocation.command.Command;

public class RemoteControl {
	Command solt;
	
	public void setCommand(Command command){
		solt = command;
	}
	
	public void pressButton(){
		solt.execute();
	}

	

}
