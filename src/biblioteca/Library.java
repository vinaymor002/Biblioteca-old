package biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {

	private final String welcomeMessage;
	private final String menuList;
	
	public Library()
	{
		welcomeMessage="Welcome !";
		menuList="1.Display Books" +
					"2.Reserve a Book" +
					"3Check Library number";
	}
	
	public String getWelcomeMessage()
	{
		return welcomeMessage;
	}
	
	public String getMenuList() {
		return menuList;
	}
	
	public int selectMenuOption() {
		return getIntegerInputFromConsole();
	}
	
	private int getIntegerInputFromConsole() {
		int input = 0;
		try{
			input=new Scanner(System.in).nextInt();
		}
		catch(InputMismatchException e){
			System.err.println("invalid integer input !! Enter avalid integer");
			input=getIntegerInputFromConsole();			
		}
		return input;				
	}
	
}
