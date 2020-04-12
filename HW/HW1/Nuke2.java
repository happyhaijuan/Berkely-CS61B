import java.io.*;
import java.net.*;

class Nuke2{
	/**


	**/
	public static void main(String[] arg) throws Exception{
	BufferedReader keyboard;
	String inputLine;
	keyboard = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("please enter a string more than 3 character:");
	inputLine = keyboard.readLine();
	System.out.println(inputLine.substring(0,1)+inputLine.substring(2,inputLine.length()));

}
	
}