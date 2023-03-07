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
 * Created: 2023/03/01 09:00
 *
 ***********************************************************************/
package decoratorpattern;

public class PanoramicSunroof extends TrimDecorator{
	public PanoramicSunroof(Vehicle vehicle) {
		super(vehicle);
	}
	public String getDescription(){
		return vehicle.getDescription()+"\nFitting Panoramic Sunroof ";
	}
	public double getVehicleCost(){
		return vehicle.getVehicleCost()+15000;
	}
}
