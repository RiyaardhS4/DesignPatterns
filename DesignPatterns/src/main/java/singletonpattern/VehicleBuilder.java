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
package singletonpattern;

public class VehicleBuilder {

	private static VehicleBuilder instance=null;

	private VehicleBuilder(){

	}
	public static VehicleBuilder getInstance(){
		if (instance==null){
			instance=new VehicleBuilder();
		}

		return instance;
	}

	public void calculatePricing(){
		System.out.println("Calculating Prices");
	}
}
