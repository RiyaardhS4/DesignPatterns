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
 * Created: 2023/03/01 08:59
 *
 ***********************************************************************/
package org.example;



/**
 * The base Decorator class follows the same interface as the other
 * components. The primary purpose of this class is to define the wrapping
 * interface for all concrete decorators. The default implementation of the
 * wrapping code might include a field for storing a wrapped component and
 * the means to initialize it.
 */
public abstract class TrimDecorator implements Vehicle{
	protected Vehicle vehicle;

	/**
	 * Constructor for TrimDecorator class .
	 * @param vehicle instance to the vehicle interface
	 */
	public TrimDecorator(Vehicle vehicle){
		this.vehicle=vehicle;
	}

	/**
	 * The Decorator delegates all work to the wrapped component.
	 * @return description
	 */
	public String getDescription(){
		return vehicle.getDescription();
	}

	/**
	 * The Decorator delegates all work to the wrapped component.
	 * @return vehicle cost
	 */
	public double getVehicleCost(){
		return vehicle.getVehicleCost();
	}
}
