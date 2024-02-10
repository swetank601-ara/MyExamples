package com.velding;

public class VendingMachineFactory {

	public static VendingMachine createVendingMachine() {
		return new VendingMachineImpl(); 
		}

	
}
