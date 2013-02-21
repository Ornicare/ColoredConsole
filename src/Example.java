import java.awt.Color;
import java.awt.Font;

import Console.Console;


public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//load the console
		Console.load();

		//type some text in
		Console.println("It's a test !");
		
		//and use some color
		Console.println("Orange text",Color.ORANGE);
		Console.println("Magenta text",new Color(255,0,255));
		
		//or use some font
		Console.println("Bold and big text", new Font("Courier", Font.BOLD, 20));
		
		//and... combo !
		Console.println("Oo, it's green",new Font("Courier", Font.ITALIC, 16), Color.GREEN);
		String s = "It's a rainbow !";
		for(int i =0; i<s.length();i++) Console.print(s.charAt(i),new Font("Courier", Font.PLAIN, 12), new Color(255/(i+1),255/s.length()*i,100));
		Console.println("");
		
		//Or use debug mode
		Console.debugln("Mmmmh... or not");
		
		//Disable the debug
		Console.setDebug(false);
		Console.debug("I'm invisible");
		
		Console.println("But me not !");
		//warn mode
		Console.warnln("Invisible text here ^");
		
		//and reactive it
		Console.setDebug(true);
		Console.debugln("Dear, I'm naked !");
		
		//and finally, destroy your eyes !
		s = "I'm here to destroy your eyes !";
		for(int i =0; i<s.length();i++) Console.print(s.charAt(i),new Font("Courier", Font.PLAIN, (int)(100*Math.cos(i))), new Color(255/s.length()*i,100,255/(i+1)));
		Console.println("");
	}

}
