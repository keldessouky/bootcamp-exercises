package com.techelevator.dog;

public class Dog {

	public Dog() {
		
	}
	
	private boolean isSleeping;

	public boolean isSleeping() {
		
		if (isSleeping) {
		isSleeping = true;
		}
		else {
			isSleeping = false;
		}
		return isSleeping;
	}
	
	public String makeSound() {
		if (isSleeping) {
			return "Zzzzz...";
		}	
			else {
				return "Woof!";
			}
		}
	public void sleep() {
		isSleeping = true;
	}
	
	public void wakeUp() {
		isSleeping = false;
	}


}
	
	
	

