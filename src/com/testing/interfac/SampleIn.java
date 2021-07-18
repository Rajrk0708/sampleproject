package com.testing.interfac;

public class SampleIn implements Interface {

	@Override
	public void mul() {
		System.out.println("mul");
		
	}

	@Override
	public void sub() {
		System.out.println("sub");
		
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}
	public static void main(String[] args) {
		Interface i = new SampleIn();
		i.add();
		i.sub();
		i.mul();
	}

}
