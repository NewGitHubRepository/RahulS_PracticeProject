package org.IBM.oops;

public class PolyMorphishamMethodOverridingEx2 extends PolyMorphishamMethodOverridingExample {
	@Override
	public void Eating() {	
		System.out.println("child Eating ");	
	}
	@Override
	public void Running() {
		System.out.println("child Running ");
		
	}
	//child methods
	public void childEating() {
		System.out.println("own method Child  is Eating ");
	}
	public void childRunning() {
		System.out.println("own method Child is Running ");
	}
	public static void main(String[] args) {
		PolyMorphishamMethodOverridingExample ex = new PolyMorphishamMethodOverridingEx2();
		ex.Eating();
		ex.Running();
		
		PolyMorphishamMethodOverridingEx2 ex2 = new PolyMorphishamMethodOverridingEx2();
		ex2.childEating();
		ex2.childRunning();
		ex2.Eating();
		ex2.Running();
		
	}
}
