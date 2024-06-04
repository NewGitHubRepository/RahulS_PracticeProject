package org.IBM.oops;

public class Player {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}
	
	public void displayName()
	{
		System.out.println("  player name is "+name);
	}
}
