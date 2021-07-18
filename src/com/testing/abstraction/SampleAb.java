package com.testing.abstraction;

public class SampleAb extends Partialabstract {

	@Override
	public void add() {
		System.out.println("add");
		
	}
	public static void main(String[] args) {
		SampleAb s = new SampleAb();
		s.add();
		s.sub();
	}

}
