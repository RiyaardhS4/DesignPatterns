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
public class VehicleAdaptor implements IVehicle {

	private String[] vehicleData;

	/**
	 * Constructor for the Vehicle Adaptor class , will be used to create a instance to the Vehicle service class.
	 *
	 * @param service instance of the vehicle service class .
	 */
	public VehicleAdaptor(String vehicleData) {
		this.vehicleData = vehicleData.split("\\|");
	}

	@Override
	public String getVehicleMake() {
		return vehicleData[1];
	}

	@Override
	public String getVehicleModel() {
		return vehicleData[2];
	}

	@Override
	public String getVinNumber() {
		return vehicleData[1];
	}

}
