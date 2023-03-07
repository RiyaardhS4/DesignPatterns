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
 * Created: 2023/02/28 08:54
 *
 ***********************************************************************/
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject concrete class with implementation to manage observers .
 */
public class Manufacturer implements ISubject {

	private List<IObserver> observers;
	private String firmwareVersion;

	/**
	 * Constructor which creates a new array list when the class is created , this list will be used to store the observers .
	 */
	public Manufacturer(){
		observers =new ArrayList<>();
	}

	/**
	 * Register an observer to the list of observers .
	 * @param subscriber observer object that will be added to the observer list .
	 */
	public void registerObserver(IObserver subscriber){

		System.out.println("Subscriber Added");
		observers.add(subscriber);
	}
	/**
	 * Unregister an observer to the list of observers .
	 * @param subscriber observer object that will be removed from observer list .
	 */
	public void unregisterObserver(IObserver subscriber){

		int index = observers.indexOf(subscriber);
		System.out.println("Subscriber removed");
		observers.remove(index);
	}



	/**
	 * Sets the firmware version , then sends out a notification to all the observers.
	 * @param firmwareVersion variable of the latest manufacturer firmware version.
	 */
	public void setFirmwareVersion(String firmwareVersion){
		this.firmwareVersion=firmwareVersion;
		notifyObservers();
	}
	/**
	 * Notifies all the observers in the list of observers with the latest firmware version .
	 */
	public void notifyObservers(){
		for(IObserver observer : observers){
			observer.update(firmwareVersion);
		}

	}

}
