package org.example;

public class Main {
	/**
	 * Creates an adaptor for the Vehicle Service Class so that it can be used with a format that is foreign to the Vehicle Service class.
	 *
	 * @param args no arguments passed
	 */
	public static void main(String[] args) {

		VehicleService service = new VehicleService();
		String vehicle="VIN12345|VW|POLO";
		IVehicle target = new VehicleAdaptor(vehicle);
		service.displayVehicleData(target);


	}


}