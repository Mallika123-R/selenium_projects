package com.stepDefinition;

public class FileReaderManager {
	 
	 private static FileReaderManager fileReaderManager = new FileReaderManager();
	 private static Pageobjects Pageobjects;
	 
	 private FileReaderManager() {
	 }
	 
	 public static FileReaderManager getInstance( ) {
	       return fileReaderManager;
	 }
	 
	 public Pageobjects Locators() {
	 return (Pageobjects == null) ? new Pageobjects() : Pageobjects;
	 }
	}