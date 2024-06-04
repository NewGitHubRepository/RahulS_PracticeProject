package org.IBM.oops;

public class Kumar implements Human {
    
	public static void main(String[] args) {
		Human ravi = new Ravi();
		Human kumar = new Kumar();
		ravi.humanRunning();
		ravi.humanCrying();
		kumar.humanRunning();
		kumar.humanCrying();
	}

	@Override
	public void humanRunning() {
		System.out.println("Kumar is running");
		
	}

	@Override
	public void humanCrying() {
		System.out.println("Kumar is crying");
		
	}
}
