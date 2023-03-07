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
package strategypattern;

public class Vehicle {

	private FuelType fuelType;
	private String vehicleName;

	public void setFuelType(FuelType fuelType){
		this.fuelType=fuelType;
	}
	public FuelType getFuelType(){
		return fuelType;
	}
	public void setVehicleName(String vehicleName){
		this.vehicleName=vehicleName;
	}
	public String getVehicleName(){
		return vehicleName;
	}

}
