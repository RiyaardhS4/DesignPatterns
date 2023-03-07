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
 * Created: 2023/02/28 07:07
 *
 ***********************************************************************/
package org.example;

/**
 * Base vehicle class that defines the interface of interest to clients.
 */
public class Vehicle {

	/**
	 * Reference to the strategy type that will be created .
	 */
	private IFuelType fuelType;
	private String vehicleName;

	public void setFuelType(IFuelType fuelType){
		this.fuelType = fuelType;
	}

	/**
	 * Retrieves vehicle fueling information.
	 * @return vehicle fueling information.
	 */
	public String fuelVehicle(){
		 return vehicleName+" "+ fuelType.fuelVehicle();
	}
	public void setVehicleName(String vehicleName){
		this.vehicleName=vehicleName;
	}
	public String getVehicleName(){
		return vehicleName;
	}

}
