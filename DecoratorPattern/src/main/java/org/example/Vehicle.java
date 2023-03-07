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
 * Created: 2023/03/01 08:58
 *
 ***********************************************************************/
package org.example;

/**
 * The base Component interface defines operations that can be altered by decorators.
 */
//
// decorators.
public interface Vehicle {

	/**
	 * Gets the description from the base component .
	 * @return description
	 */
	public String getDescription();

	/**
	 * Gets the vehicle cost from the base component .
	 * @return vehicle cost
	 */
	public double getVehicleCost();

}
