package org.example;

public class Main {
	public static void main(String[] args) {

		Vehicle vehicle = new PanoramicSunroof(new SportsSeats(new VehicleBase()));
		System.out.println(vehicle.getDescription()+"\nTotal Cost: "+ vehicle.getVehicleCost());
	}
}