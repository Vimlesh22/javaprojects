package com.bridgelabz.utility;

public class CommandExecutorProxy implements CommandExecutor {
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pwd){
		if("Vimlesh".equals(user) && "Vim@123".equals(pwd)) isAdmin=true;
		executor = new CommandExecutorImple();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(cmd);
			}
		}
	}



}
