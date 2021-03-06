package demmonic.user.server.pkhonor.command;

import demmonic.Command;
import demmonic.Loader;
import demmonic.container.reflect.ReflectionClass;
import demmonic.ui.CommandUI;

public class GetChatboxInterfaceCommand extends Command {

	public GetChatboxInterfaceCommand() {
		super("getchatboxinterface");
	}

	@Override
	public void parse(String input) {
		ReflectionClass client = Loader.getClass("pkhonor.Client");

		CommandUI.push("open interface: " + client.getField("jm", "int").getValue());
	}

	@Override
	public String getSyntax() {
		return "getchatboxinterface";
	}
	
}
