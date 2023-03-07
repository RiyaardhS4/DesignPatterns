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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manufacturer {

	private List<FirmwareSubscriber> subscribers;
	private String firmwareVersion;
	public Manufacturer(){
		subscribers=new ArrayList<>();
	}

	public void registerSubscriber(FirmwareSubscriber subscriber){

		System.out.println("Subscriber Added");
		subscribers.add(subscriber);
	}
	public void unregisterSubscriber(FirmwareSubscriber subscriber){

		int index = subscribers.indexOf(subscriber);
		System.out.println("Subscriber removed");
		subscribers.remove(index);
	}
	public void notifySubscribers(){
		for(FirmwareSubscriber subscriber :subscribers){
			subscriber.update(firmwareVersion);
		}

	}
	public void setFirmwareVersion(String firmwareVersion){
		this.firmwareVersion=firmwareVersion;
		notifySubscribers();
	}

}
