/************************************************************************
 *                                                                      *
 *  DDDD     SSSS    AAA        Daten- und Systemtechnik Aachen GmbH    *
 *  D   D   SS      A   A       Pascalstrasse 28                        *
 *  D   D    SSS    AAAAA       52076 Aachen-Oberforstbach, Germany     *
 *  D   D      SS   A   A       Telefon: +49 (0)2408 / 9492-0           *
 *  DDDD    SSSS    A   A       Telefax: +49 (0)2408 / 9492-92          *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by DSA - all rights reserved                          *
 *                                                                      *
 ************************************************************************
 *
 * Author : Riyaardh Adam
 * Created: 2023/03/01 08:18
 *
 ***********************************************************************/
package org.example;

/**
 * The vehicle adaptor class adapts the Vehicle Target Class to work like a Vehicle Service class .
 */
public class VehicleAdaptor implements IVehicleTarget {

	private VehicleService service;

	/**
	 * Constructor for the Vehicle Adaptor class , will be used to create a instance to the Vehicle service class.
	 * @param service instance of the vehicle service class .
	 */
	public VehicleAdaptor(VehicleService service){
		this.service= service;
	}

	/**
	 * Conversion of the Vehicle Target method to work like a Vehicle Service method .
	 * @param vehicleData vehicle information in a string format.
	 */
	@Override
	public void displayVehicleData(String vehicleData) {

		var vehicleSplit = vehicleData.split("\\|");
		Vehicle vehicle = new Vehicle();
		vehicle.setVinNumber(vehicleSplit[0]);
		vehicle.setVehicleMake(vehicleSplit[1]);
		vehicle.setVehicleModel(vehicleSplit[2]);
		service.displayVehicleData(vehicle);
	}


}
