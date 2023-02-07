/** HelloWorld.java
*   A simple program that says hello and prints out host details.
*/

import java.net.InetAddress;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		String name = scnr.nextLine();

		System.out.println(name);
    	System.out.println("Hello World!");
    	System.out.println("I'm a Java program running on a computer.");
    	System.out.println("Here are the details:");
    	try{
    		InetAddress inetAddress = InetAddress.getLocalHost();
    		System.out.println("IP Address:- " + inetAddress.getHostAddress());
    		System.out.println("Host Name:- " + inetAddress.getHostName());
    	} catch(Exception e){
    		System.err.println("No details found!");
    	}
    }
}
