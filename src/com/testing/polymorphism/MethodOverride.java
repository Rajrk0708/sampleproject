package com.testing.polymorphism;

public class MethodOverride extends MethodOverrideSample {
public void add() {
	System.out.println("sub");
}
public static void main(String[] args) {
	MethodOverrideSample mor = new MethodOverride();
	mor.add();
	
}
}
