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
 * Created: 2023/03/07 09:04
 *
 ***********************************************************************/
package org.example;

/**
 * Interface that defines the methods available for the concrete class Vehicle.
 */

public interface IVehicle {
	/**
	 * Interface for base method to get the model from the vehicle class.
	 *
	 * @return vehicle model
	 */
	String getVehicleModel();
	/**
	 * Interface for base method to get the make from the vehicle class.
	 *
	 * @return vehicle make
	 */
	String getVehicleMake();

	/**
	 * Interface for base method to get the vin number from the vehicle class.
	 *
	 * @return vehicle vin number
	 */
	String getVinNumber();
}
