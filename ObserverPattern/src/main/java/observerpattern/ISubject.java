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
 * Created: 2023/03/02 10:42
 *
 ***********************************************************************/
package observerpattern;

public interface ISubject {

	/**
	 * Interface for registerObserver base method to register an observer to the list of observers .
	 * @param subscriber observer object that will be added to the observer list .
	 */
	 void registerObserver(IObserver observer);

	/**
	 * Interface for unregisterObserver base method to unregister an observer from the list of observers .
	 * @param subscriber observer object that will be removed from the observer list .
	 */
	 void unregisterObserver(IObserver observer);


	/**
	 * Interface for the notifyObservers method . Notifies all the observers in the list of observers with the latest firmware version .
	 */
	 void notifyObservers();
}
