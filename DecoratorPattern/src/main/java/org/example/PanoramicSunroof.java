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
 * Created: 2023/03/01 09:01
 *
 ***********************************************************************/
package org.example;


/**
 * Concrete Decorators call the wrapped object and alter its result in some way .
 */
public class PanoramicSunroof extends TrimDecorator{

	/**
	 * Constructor that contains super to extended class.
	 * @param vehicle extended class .
	 */
	public PanoramicSunroof(Vehicle vehicle) {
		super(vehicle);
	}

	/**
	 * Decorators may call parent implementation of the operation, instead
	 * of calling the wrapped object directly. This approach simplifies
	 * extension of decorator classes.
	 */

	/**
	 * Gets parent implementation of get vehicle description method .
	 *
	 * @return description
	 */
	public String getDescription(){
		return vehicle.getDescription()+"\nFitting Panoramic Sunroof ";
	}

	/**
	 * Gets parent implementation of get vehicle cost method .
	 *
	 * @return vehicle cost
	 */
	public double getVehicleCost(){
		return vehicle.getVehicleCost()+15000;
	}
}
