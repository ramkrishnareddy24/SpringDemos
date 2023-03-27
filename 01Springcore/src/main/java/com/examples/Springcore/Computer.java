package com.examples.Springcore;

public class Computer {
	int cpu;
	String memory;
	String storage;
	
	
	public Computer(int cpu, String memory, String storage) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.storage = storage;
	}


	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", memory=" + memory + ", storage=" + storage + "]";
	}
	
	
	
}
