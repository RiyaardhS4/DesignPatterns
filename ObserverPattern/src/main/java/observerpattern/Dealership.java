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

// Concrete Observers react to the updates issued by the Subject they had
// been attached to.
public class Dealership implements IObserver {
	private String firmwareVersion;
	private String dealerName;

	/**
	 * Constructor for the Dealership base class .
	 * @param dealerName sets the name of the dealer for the instance of this class .
	 */
	public Dealership(String dealerName) {
		this.dealerName=dealerName;
	}

	/**
	 * updates the firmware version of the instance of this class .
	 * @param firmwareUpdate version that will be set as firmware version.
	 */
	public void update(String firmwareUpdate) {
		this.firmwareVersion = firmwareUpdate;
		System.out.println(dealerName + " Firmware has been updated to " + firmwareUpdate);
	}
}
