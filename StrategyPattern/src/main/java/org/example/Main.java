package org.example;

public class Main {
	public static void main(String[] args) {

		Vehicle car1 = new Vehicle();
		car1.setVehicleName("Ford Ranger");
		car1.setFuelType(new DieselStrategy());

		Vehicle car2 = new Vehicle();
		car2.setVehicleName("Tesla");
		car2.setFuelType(new ElectricStrategy());

		System.out.println("Car 2 is a "+car2.fuelVehicle());

		System.out.println("Car 1 is a "+car1.fuelVehicle());
	}

}