package com.bridgelabz.utility;

public class CommandExecutorImple implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		
		System.out.println("'" + cmd + "' command executed.");
	}

}
