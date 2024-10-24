package helloworld;

import java.io.IOException;

public class Executable {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Hello World!");
		greetTheWorld();
		greetTheWorld();
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
		Text text1 = new Text();
		
		text1.ReadFileFromWD();
		text1.toString();
		
	}
	
	private static void greetTheWorld() {
		System.out.println("Hello World2!");
	}

}
