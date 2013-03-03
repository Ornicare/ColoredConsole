import java.awt.Color;
import java.awt.Font;

import cconsole.CConsole;



public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//load the console
		CConsole.load();

		//type some text in (len test)
		//for(int i =0;i<5000;i++) CConsole.println("It's suisqdiugsqduhouqsdhuosqdhuosqdohusqdhuosqdddddddddddddddddddddddddddddddsqdddddddddddddddddddddddddddddddddddddddda test !"+i,new Color((int)(Math.abs(255*Math.cos(i))),(int)(Math.abs(255*Math.cos(i))),100));
		CConsole.println("It's a test !");
		
		
		//and use some color
		CConsole.println("Orange text",Color.ORANGE);
		CConsole.println("Magenta text",new Color(255,0,255));
		
		//or use some font
		CConsole.println("Bold and big text", new Font("Courier", Font.BOLD, 20));
		
		//and... combo !
		CConsole.println("Oo, it's green",new Font("Courier", Font.ITALIC, 16), Color.GREEN);
		String s = "It's a rainbow !";
		for(int i =0; i<s.length();i++) CConsole.print(s.charAt(i),new Font("Courier", Font.PLAIN, 12), new Color(255/(i+1),255/s.length()*i,100));
		CConsole.println("");
		
		//Or use debug mode
		CConsole.debugln("Mmmmh... or not");
		
		//Disable the debug
		CConsole.setDebug(false);
		CConsole.debug("I'm invisible");
		
		CConsole.println("But me not !");
		//warn mode
		CConsole.warnln("Invisible text here ^");
		
		//and reactive it
		CConsole.setDebug(true);
		CConsole.debugln("Dear, I'm naked !");
		
		//and finally, destroy your eyes !
		s = "I'm here to destroy your eyes !";
		for(int i =0; i<s.length();i++) CConsole.print(s.charAt(i),new Font("Courier", Font.PLAIN, (int)(70*Math.cos(i))), new Color(255/s.length()*i,100,255/(i+1)));
		CConsole.println("");
		
		//And System.err and System.out are also catch !
		System.out.println("I'm a console message");
		System.err.println("I'm an error message");
		System.out.printf("%s a test","It's");
	}

}
