package com.naver;

import java.util.Scanner;

public class EndCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.exit(0);
		sc.close();
		
	}

	@Override
	public String toString() {
		return "Á¾·á";
	}
	

}
