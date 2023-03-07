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
 * Created: 2023/03/01 08:17
 *
 ***********************************************************************/
package org.example;

public class VehicleService {

	/**
	 * Displays vehicle information from vehicle class.
	 *
	 * @param vehicle vehicle information in vehicle class.
	 */
	public void displayVehicleData(IVehicle vehicle){
		System.out.println("Inserting Vehicle Data with \nVIN: "+vehicle.getVinNumber()+" \nMake: "+vehicle.getVehicleMake()+" \nModel: "+vehicle.getVehicleModel());
	}
}
