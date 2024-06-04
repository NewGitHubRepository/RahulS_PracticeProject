package org.IBM.oops;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);

		Player p1 = new Player();
		Player p2 = new Player();
		
		p1.setName("X-man");
		p2.setName("Spider Man");
		
		String n = p1.getName();
		System.out.println("Player1 name is : "+ n);
		System.out.println("Player2 name is : "+ p2.getName());
		p1.displayName();
	}

}
