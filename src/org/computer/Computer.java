package org.computer;

public class Computer extends Desktop{
	public void computerModel() {
		System.out.println("Computer Model: Lenovo");
	}
	
	public static void main(String[] args) {
		Computer c=new Computer();
		c.computerModel();
		c.desktopSize();
	}
}
