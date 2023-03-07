package org.example;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		VehicleChassisFactory factory = new VehicleChassisFactory();
		IVehicleChassis vehicleChassis = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of vehicle chassis would you like to create ? (S/H)");
		if (userInput.hasNextLine()) {
			String typeOfChassis = userInput.nextLine();
			while (!typeOfChassis.equals("99")) {
				vehicleChassis = factory.makeVehicleChassis(typeOfChassis);
				if (vehicleChassis!=null) {
					System.out.println(	vehicleChassis.getChassisType());
				} else {
					System.out.println("Invalid Chassis Type");
				}
				typeOfChassis = userInput.nextLine();
			}

		}

		userInput.close();
	}

}