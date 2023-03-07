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
 * Created: 2023/03/01 08:18
 *
 ***********************************************************************/
package adapterpattern;

public class VehicleAdaptor implements IVehicleTarget {

	private VehicleService service= new VehicleService();

	@Override
	public void insertVehicleData(String vehicleData) {

		var vehicleSplit = vehicleData.split("\\|");
		Vehicle vehicle = new Vehicle();
		vehicle.setVinNumber(vehicleSplit[0]);
		vehicle.setVehicleMake(vehicleSplit[1]);
		vehicle.setVehicleModel(vehicleSplit[2]);
		service.insertVehicleData(vehicle);
	}


}
