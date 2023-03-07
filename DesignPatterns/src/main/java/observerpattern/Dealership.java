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
 * Created: 2023/02/28 08:58
 *
 ***********************************************************************/
package observerpattern;

public class Dealership implements FirmwareSubscriber {
	private String firmwareVersion;
	private String dealerName;
	private Manufacturer manufacturer;

	public Dealership(Manufacturer manufacturer,String dealerName) {
		this.manufacturer = manufacturer;
		this.dealerName=dealerName;
		manufacturer.registerSubscriber(this);
	}

	@Override
	public void update(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
		System.out.println(dealerName + " Firmware has been updated to " + firmwareVersion);

	}
}
