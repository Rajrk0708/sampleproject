package com.testing.constrocto;

public class SampleConstructor {
public SampleConstructor() {
	System.out.println("Normal Constructor");
}

public SampleConstructor(int a) {
	System.out.println("Parameterized Constructor");
}

public SampleConstructor(int a, int b) {
	this("raj");
	System.out.println("chaining key using this");
}

public SampleConstructor(String a) {
	System.out.println("chaining value using this");
}

public static void main(String[] args) {
	SampleConstructor sc = new SampleConstructor();
	SampleConstructor ss = new SampleConstructor(5);
	SampleConstructor sd = new SampleConstructor(5,8);
}
}
