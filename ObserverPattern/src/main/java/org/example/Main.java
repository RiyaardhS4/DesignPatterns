package org.example;
import observerpattern.Dealership;
import observerpattern.Manufacturer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Manufacturer manufacturer = new Manufacturer();
		Dealership dealership1 = new Dealership( "Tavcor");
		manufacturer.registerObserver(dealership1);
		Dealership dealership2 = new Dealership("Lindsay Saker");
		manufacturer.registerObserver(dealership2);

		manufacturer.setFirmwareVersion("1.0.2");
		manufacturer.unregisterObserver(dealership1);
		manufacturer.setFirmwareVersion("1.0.3");
	}
}