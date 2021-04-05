package com.lockme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockMe App", "Phani Ambarapu ");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
