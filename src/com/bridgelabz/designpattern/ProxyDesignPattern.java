package com.bridgelabz.designpattern;

import com.bridgelabz.utility.CommandExecutor;
import com.bridgelabz.utility.CommandExecutorProxy;

public class ProxyDesignPattern {
	
	public static void main(String[] args){
		
		CommandExecutor executor = new CommandExecutorProxy("Vimlesh", "wrongpassword");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
	}
		

}
