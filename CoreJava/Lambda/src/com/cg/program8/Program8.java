package com.cg.program8;

public class Program8 {
	public static void main(String[] args) {
		thread execute = new thread();
		System.out.println(Thread.currentThread());
		execute.start();
	}
}
