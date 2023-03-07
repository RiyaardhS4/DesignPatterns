package org.example;

import adapterpattern.IVehicleTarget;
import adapterpattern.VehicleAdaptor;
import decoratorpattern.PanoramicSunroof;
import decoratorpattern.SportsSeats;
import decoratorpattern.VehicleBase;
import factorypattern.VehicleChassis;
import factorypattern.VehicleChassisFactory;
import observerpattern.Dealership;
import observerpattern.Manufacturer;
import singletonpattern.VehicleBuilder;
import strategypattern.DieselStrategy;
import strategypattern.ElectricStrategy;
import strategypattern.Vehicle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		decoratorPattern();
	}

	public static void strategyPattern() {
		Vehicle car1 = new Vehicle();
		car1.setVehicleName("Ford Ranger");
		car1.setFuelType(new DieselStrategy());

		Vehicle car2 = new Vehicle();
		car2.setVehicleName("Tesla");
		car2.setFuelType(new ElectricStrategy());

		System.out.println("Car 2 is a " + car2.getVehicleName());
		car2.getFuelType().fuelVehicle();

		System.out.println("Car 1 is a " + car1.getVehicleName());
		car1.getFuelType().fuelVehicle();
	}

	public static void observerPattern() {
		Manufacturer manufacturer = new Manufacturer();
		Dealership dealership1 = new Dealership(manufacturer, "tavcor");
		Dealership dealership2 = new Dealership(manufacturer, "lindsay saker");
		manufacturer.setFirmwareVersion("1.0.2");
		manufacturer.unregisterSubscriber(dealership1);
		manufacturer.setFirmwareVersion("1.0.3");
	}

	public static void factoryPattern() {

		VehicleChassisFactory factory = new VehicleChassisFactory();
		VehicleChassis vehicleChassis = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of vehicle chassis would you like to create ? (S/H)");
		if (userInput.hasNextLine()) {
			String typeOfChassis = userInput.nextLine();
			while (!typeOfChassis.equals("99")) {
				vehicleChassis = factory.makeVehicleChassis(typeOfChassis);
				if (vehicleChassis!=null) {
					vehicleChassis.printChassisDetails();
				} else {
					System.out.println("Invalid Chassis Type");
				}
				typeOfChassis = userInput.nextLine();
			}

		}

		userInput.close();
	}
	public static void singletonPattern() {

		VehicleBuilder builder = VehicleBuilder.getInstance();
		builder.calculatePricing();

	}
	public static void adapterPattern() {

		String vehicle="VIN12345|VW|POLO";
		IVehicleTarget target = new VehicleAdaptor();
		target.insertVehicleData(vehicle);

	}

	public static void decoratorPattern() {

		decoratorpattern.Vehicle vehicle = new PanoramicSunroof(new VehicleBase());
		System.out.println(vehicle.getDescription()+"\nTotal Cost: "+ vehicle.getVehicleCost());

	}
}