package com.testing.multipleinheritance;

public class MultipleInheritance implements Sample2, Sample1 {
	@Override
	public void sub() {
		System.out.println("sub");
		
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}
public static void main(String[] args) {
	MultipleInheritance mi = new MultipleInheritance();
	mi.add();
	mi.sub();
}
	

}
