package org.example;
public class Main {
	/**
	 * Main entry point for the application .
	 * @param args any arguments that have been passed when the application is started .
	 */
	public static void main(String[] args) {

		VehicleBuilder builder = VehicleBuilder.getInstance();
		builder.addWheels();
	}
}