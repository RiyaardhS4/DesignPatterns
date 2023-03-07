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
 * Created: 2023/02/28 14:25
 *
 ***********************************************************************/
package org.example;

public class VehicleBuilder {

	private static VehicleBuilder instance=null;

	/**
	 * Constructor for vehicle builder class, it is private so a new instance of the class cannot be created via the constructor .
	 */
	private VehicleBuilder(){
	}

	/**
	 * Get vehicle instance method , gets the instance of the Vehicle Builder class , if the instance is null it will create a new one . This ensures only one instance of the Vehicle Builder class is created .
	 *
	 * @return Vehicle Builder instance
	 */
	public static VehicleBuilder getInstance(){
		if (instance==null){
			instance=new VehicleBuilder();
		}
		return instance;
	}

	/**
	 * Method to test the instance of the Vehicle Builder class is accessible .
	 */
	public void addWheels(){
		System.out.println("Adding wheels to vehicle");
	}
}
