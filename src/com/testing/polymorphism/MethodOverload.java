package com.testing.polymorphism;

public class MethodOverload {
public void add(int a) {
	System.out.println(a);
}

void sub(String name) {
	System.out.println(name);
}

static void mul(float sal) {
	System.out.println(sal);
}

public static void main(String[] args) {
	MethodOverload mol = new MethodOverload();
	mol.add(1);
	mol.sub("Raj");
	mul(100000.00f);
	
}

}
